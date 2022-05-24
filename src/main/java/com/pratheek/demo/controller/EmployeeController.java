package com.pratheek.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratheek.demo.entity.Employee;
import com.pratheek.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/save")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("Employee"+employee.toString());
		return repository.save(employee);
	}
	
	@GetMapping("/fetch")
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	@DeleteMapping("/delete")
	public void deleteEmployee(@RequestParam("id") int id) {
		
		repository.deleteById(id);
		
	}


}
