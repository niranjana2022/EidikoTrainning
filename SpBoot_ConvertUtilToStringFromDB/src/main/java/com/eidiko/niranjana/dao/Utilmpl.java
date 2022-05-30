package com.eidiko.niranjana.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Utilmpl implements UtilDao {

	@Autowired
	private JdbcTemplate jt;
	@Override
	public String Insertdata(Integer eid, String ename, String edob, String edoj, String edor) {
		String query="INSERT INTO EMPLOYEE VALUES(101,'SISU','31-10-1999','25-10-2021','20-4-2022')";
		int count=0;
		count = jt.update(query,eid,ename,edob,edoj,edor);
		
		return "inserted";
	}

}
