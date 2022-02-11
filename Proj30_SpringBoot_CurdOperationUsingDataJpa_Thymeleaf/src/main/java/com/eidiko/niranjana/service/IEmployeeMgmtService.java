package com.eidiko.niranjana.service;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.eidiko.niranjana.entity.Employee;

public interface IEmployeeMgmtService {
	
	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployees();
	Employee getOneEmployee(Integer id);
	void deleteEmployee(Integer id);
	void updateEmployee(Employee e);
	Page<Employee> getAllEmployees(Pageable pageable);
	//Integer  fetchEmployeeByEno(int eno);
}
