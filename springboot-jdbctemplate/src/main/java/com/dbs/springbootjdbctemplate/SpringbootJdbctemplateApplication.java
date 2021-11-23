package com.dbs.springbootjdbctemplate;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dbs.springbootjdbctemplate.dto.Department;
import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.service.DepartmentService;
import com.dbs.springbootjdbctemplate.service.EmployeeService;

@SpringBootApplication
public class SpringbootJdbctemplateApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootJdbctemplateApplication.class, args);
//		DataSource dataSource = applicationContext.getBean(DataSource.class);
//		System.out.println(dataSource != null);
//
//		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
//
//		Employee employee = new Employee("ab001", "Amogha", "Bhandari", "Hyd", 1200.50f);
//		Employee employee2 = employeeService.createEmployee(employee);
//
////		System.out.println(employee2);
//
//		Optional<List<Employee>> optional1 = employeeService.getEmployeesByLastName("Bhandari");
//		if (optional1.isPresent()) {
//			System.out.println(optional1.get());
//		} else {
//			System.out.println("record not found");
//		}
//
//		System.out.println("By Id and LastName call");
//		Optional<Employee> optional2 = employeeService.getEmployeesByIdAndByLastName("ab001", "Bhandari");
//		System.out.println(optional2.get());

//		DepartmentService departmentService = applicationContext.getBean(DepartmentService.class);
//
//		Department department = new Department("EIE", "103", "Banglore");
//		Department Department2 = departmentService.createDepartment(department);
	}
}