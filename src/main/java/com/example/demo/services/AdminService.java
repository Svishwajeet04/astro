package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.BedDto;
import com.example.demo.dtos.DepartmentDto;
import com.example.demo.dtos.LabDto;
import com.example.demo.dtos.TestParameterDto;
import com.example.demo.dtos.TestTypeDto;
import com.example.demo.entities.Bed;
import com.example.demo.entities.Department;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Laboratory;
import com.example.demo.entities.TestParameters;
import com.example.demo.entities.TestType;
import com.example.demo.repositories.BedRepo;
import com.example.demo.repositories.DepartmentRepo;
import com.example.demo.repositories.EmployeeRepo;
import com.example.demo.repositories.LaboratoryRepo;
import com.example.demo.repositories.TestParametersRepo;
import com.example.demo.repositories.TestTypeRepo;

@Service
public class AdminService {

	@Autowired
	BedRepo brepo;

	@Autowired
	EmployeeRepo erepo;

	@Autowired
	LaboratoryRepo lrepo;

	@Autowired
	TestTypeRepo trepo;

	@Autowired
	DepartmentRepo drepo;

	@Autowired
	TestParametersRepo tprepo;
//
//	@Autowired
//	OTRepo orepo;

	public Bed addBed(BedDto dto) {
		Bed b = new Bed();
		b.setLocation(dto.getLocation());
		b.setStatus(false);
		b.setBedType(dto.getType());
		b = brepo.save(b);
		return b;
	}

	public Laboratory addLab(LabDto dto) {
		Laboratory l = new Laboratory();
		Optional<Employee> e = erepo.findById(dto.getLabInchargeId());
		if (e.isPresent()) {
			l.setLabIncharge(e.get());
			l.setName(dto.getName());
			l = lrepo.save(l);
			return l;
		}
		return null;

	}

	public Department addDepartment(DepartmentDto dto) {
		Department d = new Department();
		Optional<Employee> e = erepo.findById(dto.getHodId());
		if (e.isPresent()) {
//			d.setHOD(e.get());
			d.setName(dto.getName());
			d = drepo.save(d);
			return d;
		}
		return null;
	}

	public TestType addTestType(TestTypeDto dto) {
		TestType t = new TestType();
		Optional<Laboratory> e = lrepo.findById(dto.getLabId());
		if (e.isPresent()) {
			t.setLab(e.get());
			t.setName(dto.getName());
			t.setProcess(dto.getProcess());
			t.setPrice(dto.getPrice());
			trepo.save(t);
			return t;
		}
		return null;
	}

	public TestParameters addTestParameter(TestParameterDto dto) {
		TestParameters t = new TestParameters();
		Optional<TestType> e = trepo.findById(dto.getTestTypeId());
		if (e.isPresent()) {
			t.setName(dto.getName());
			t.setRange(dto.getRange());
			t.setTestType(e.get());
			tprepo.save(t);
			return t;
		}
		return null;
	}

//	public OT addOT(OTDto dto) {
//		OT o = new OT();
//		Optional<Department> e = drepo.findById(dto.getDepartmentId());
//		if (e.isPresent()) {
//			o.setPrice(dto.getPrice());
//			o.setDepartment(e.get());
//			o.setName(dto.getName());
//			o = orepo.save(o);
//			return o;
//		}
//		return null;
//	}

}
