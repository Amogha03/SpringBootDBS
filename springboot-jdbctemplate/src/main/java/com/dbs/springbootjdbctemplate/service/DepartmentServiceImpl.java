package com.dbs.springbootjdbctemplate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.springbootjdbctemplate.dto.Department;
import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department createDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public Department deleteDepartment(String deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department updateDepartment(String deptId, Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> getDepartmentById(String empId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(empId);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		departmentRepository.deleteAll();
	}

	@Override
	public Optional<List<Department>> getAllDepartments() {
		// TODO Auto-generated method stub
		List<Department> departments = departmentRepository.findAll();
		if (departments.isEmpty()) {
			return Optional.empty();
		}
		else {
			return Optional.of(departments);
		}
	}

}