package com.example.demo.services;

import java.util.LinkedList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.AuthenticationDto;
import com.example.demo.dtos.AuthenticationResponse;
import com.example.demo.dtos.RegisterDto;
import com.example.demo.entities.Department;
import com.example.demo.entities.Employee;
import com.example.demo.repositories.DepartmentRepo;
import com.example.demo.repositories.EmployeeRepo;

@Service
public class LoginService {

	@Autowired
	private JwtUtilService jwtutil;

	@Autowired
	private EmployeeDetailService employeeDetailService;

	@Autowired
	private EmployeeRepo erepo;
	@Autowired
	private DepartmentRepo drepo;

	public AuthenticationResponse createAuthenticationToken(AuthenticationDto ar) {

		Optional<Employee> udO = erepo.findByEmail(ar.getEmail());
		if (udO.isPresent()) {
			Employee ud = udO.get();
			if (ud.getPassword().equals(ar.getPassword())) {
				final String jwt = jwtutil.createToken(ar.getEmail(), new LinkedList<String>());
				AuthenticationResponse ar1 = new AuthenticationResponse(jwt);
				ar1.setRole(((Employee) ud).getRole());
				ar1.setEmail(((Employee) ud).getEmail());
				ar1.setName(((Employee) ud).getName());
				ar1.setId(((Employee) ud).getId());
				return ar1;
			}
		}
		return null;
	}

	public Employee createEmployee(RegisterDto dto) {
		if (erepo.findByEmail(dto.getEmail()).isEmpty()) {
			Employee emp = new Employee();
			emp.setConsultantFee(dto.getConsultantFee());
			Optional<Department> d = drepo.findById(dto.getDepartment());
			if (d.isPresent())
				emp.setDepartment(d.get());
			emp.setEmail(dto.getEmail());
			emp.setDesignation(dto.getDesignation());
			emp.setName(dto.getName());
			emp.setRole(dto.getRole());
			emp.setExperience(dto.getExperience());
			emp.setExtraInformation(dto.getExtraInformation());
			emp.setPassword(dto.getPassword());
			emp = erepo.save(emp);
			return emp;

		}
		return null;
	}

}
