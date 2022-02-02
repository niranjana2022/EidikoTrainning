/*
package com.eidiko.niranjana.SpBoot_JdbcTEmplate.testRepo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.eidiko.niranjana.dao.EmployeeDAO;
@SpringBootTest
public class TestEmployeeDAO {

	@Autowired
	private EmployeeDAO empdao;
	@Test
	@Disabled
	public void testGetEmpCount()
	{
		int expected=9;
		int actual = empdao.getEmpsCount();
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInsertEmp()
	{
		int actual = empdao.insertEmp(108," Shyam", "Delhi");
		System.out.println(actual);
		Object expected[] = {108," Shyam", "Delhi"};
		System.out.println(expected);
		assertEquals(expected, actual);
	}
}
*/