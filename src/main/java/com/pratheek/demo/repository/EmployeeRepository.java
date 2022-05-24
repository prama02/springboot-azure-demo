package com.pratheek.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratheek.demo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
