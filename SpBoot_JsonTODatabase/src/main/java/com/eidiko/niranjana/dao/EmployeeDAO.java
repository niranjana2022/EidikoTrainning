package com.eidiko.niranjana.dao;
import com.eidiko.niranjana.entity.Employee;

public interface EmployeeDAO {
	Integer saveEmployee(Employee emp);
	Integer deleteEmployee(Employee emp);
	Integer updateEmployee(Employee emp);
}
