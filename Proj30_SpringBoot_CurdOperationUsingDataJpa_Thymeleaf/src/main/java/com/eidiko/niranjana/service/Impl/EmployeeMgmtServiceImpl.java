package com.eidiko.niranjana.service.Impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.entity.Employee;
import com.eidiko.niranjana.repo.IEmployeeRepo;
import com.eidiko.niranjana.service.IEmployeeMgmtService;
@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{
	@Autowired
		private IEmployeeRepo  repo;
//======================Employees Count==========================

	public Integer saveEmployee(Employee e) {
		//calculations
		//employeeUtil.calculateData(e);
		return repo.save(e).getEmpId();
	}

	@Override
	public List<Employee> getAllEmployees() {
			return repo.findAll();
		}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else 
			return null;
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Page<Employee> getAllEmployees(Pageable pageable) {
		return repo.findAll(pageable);
	}
}
