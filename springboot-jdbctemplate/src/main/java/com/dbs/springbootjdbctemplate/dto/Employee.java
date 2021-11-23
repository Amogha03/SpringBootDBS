package com.dbs.springbootjdbctemplate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employeetb2")
public class Employee implements Serializable {
	@Id
	@Column(name = "emp_id")
	private String empId;
	@Column(name = "emp_FirstName")
	private String empFirstName;
	private String empLastName;
	private String address;
	private float empSalary;
}