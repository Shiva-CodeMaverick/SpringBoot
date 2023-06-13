package com.dailycodebuffer.SpringBootStartup.controller;

import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.SpringBootStartup.entity.Department;
import com.dailycodebuffer.SpringBootStartup.error.DepartmentNotFoundException;
import com.dailycodebuffer.SpringBootStartup.service.DepartmentService;

import jakarta.validation.Valid;

@RestController

public class DepartmentController {
	@Autowired
	private DepartmentService departmentService ;
	
	private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);
	
	
	
	
	@PostMapping("/departments")
 public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("Inside saveDepartment of DepartmentController");
		return departmentService.saveDepartment(department);
 }
	
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList() {
		LOGGER.info("Inside fetchDepartment of DepartmentController");
		return departmentService.fetchDepartmentList();
		
	}
	
	
	@GetMapping("/departments/{Id}")
	public Department fetchDepartmentById(@PathVariable ("Id") long departmentId ) throws DepartmentNotFoundException
	{
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	
	 @DeleteMapping("/departments/{id}")
	    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
	        departmentService.deleteDepartmentById(departmentId);
	        return "Department deleted Successfully!!";
	    }
	 
	 
	 
	 @PutMapping("/departments/{id}")
	    public Department updateDepartment(@PathVariable("id") Long departmentId,
	    		@RequestBody Department department) {
	        return departmentService.updateDepartment(departmentId,department);
	    }
	 
	 
	 
	 @GetMapping("/departments/name/{name}")
	    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
	        return departmentService.fetchDepartmentByName(departmentName);
	    }
	 
		 
		 
	 }

	
 
