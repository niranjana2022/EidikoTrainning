package com.eidiko.niranjana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.dao.EmployeeDAO;
import com.eidiko.niranjana.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	@Override
	public Integer fetchEmployeeService(Employee emp) {
			//use DAO
		return dao.saveEmployee( emp);
	}

}
