package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepo;

@Service
public class EmployeeDetailService implements UserDetailsService {

	@Autowired
	EmployeeRepo eRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails d = null;
		Optional<Employee> u = eRepo.findByEmail(username);
		if (u.isPresent())
			d = u.get();
		else {
			throw new UsernameNotFoundException(username);
		}
		return d;
	}

}
