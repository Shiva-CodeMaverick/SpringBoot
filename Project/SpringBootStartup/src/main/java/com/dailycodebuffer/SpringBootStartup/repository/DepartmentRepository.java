package com.dailycodebuffer.SpringBootStartup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.SpringBootStartup.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
	public Department findByDepartmentName(String departmentName);
}

