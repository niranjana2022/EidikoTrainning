package com.eidiko.niranjana.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.entity.Employee;
@Service
public class EmployeeDAOImpl implements EmployeeDAO{
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public Integer saveEmployee(Employee emp) {
		String sql = "insert into emptabdata values(?,?,?)";
		return jt.update(sql, emp.geteId(), emp.geteName(), emp.geteAddrs()); 
	}
	@Override
	public Integer deleteEmployee(Employee emp) {
		String sql2 = "update emptabdata set eName=?, eAddrs=? where eId=?";
		return jt.update(sql2, emp.geteName(), emp.geteAddrs(), emp.geteId());
	}
	@Override
	public Integer updateEmployee(Employee emp) {
		String sql3 = "delete from emptabdata where eId=?";
		return jt.update(sql3, emp.geteId());
	}
}
