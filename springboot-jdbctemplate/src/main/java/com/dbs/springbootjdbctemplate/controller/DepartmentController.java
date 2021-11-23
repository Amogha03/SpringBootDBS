package com.dbs.springbootjdbctemplate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.springbootjdbctemplate.dto.Department;
import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@PostMapping("/create")
	public ResponseEntity<?> addDepartment(@RequestBody Department department) {
		Department department2 = departmentService.createDepartment(department);
		if (department2 != null)
			return ResponseEntity.status(201).body(department);
		else

			return ResponseEntity.status(400).body("details are not proper");
	}

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") String id) {
		Optional<Department> optional = departmentService.getDepartmentById(id);
		if (optional.isPresent())
			return optional.get();
		else
			return null;

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDepartmentById(@PathVariable("id") String id) {
		Department department = departmentService.deleteDepartment(id);
		if (department != null)
			return ResponseEntity.status(204).body("record deleted successfully");

		else
			return ResponseEntity.status(404).body("record not found");
	}

	@DeleteMapping
	public void deleteAll() {
		departmentService.deleteAll();
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAllDepartments() {
		Optional<List<Department>> optional = departmentService.getAllDepartments();
		if (optional.isPresent())
			return ResponseEntity.status(200).body(optional.get());
		else
			return ResponseEntity.noContent().build();
	}
}