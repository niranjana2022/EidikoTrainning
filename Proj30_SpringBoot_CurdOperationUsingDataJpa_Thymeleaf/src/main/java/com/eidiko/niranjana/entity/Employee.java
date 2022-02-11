package com.eidiko.niranjana.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmployeeRegistration")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	@Column(name="EID")
	private Integer empId;
	
	@Column(name="ENAME")
	private String empName;
	
	@Column(name="EGEN")
	private String empGen;
	
	@Column(name="EMAIL")
	private String empMail;
	
	
	@Column(name="EDEPT")
	private String empDept;


	public Employee() {
	
	}


	public Employee(Integer empId) {
		super();
		this.empId = empId;
	}
	
}