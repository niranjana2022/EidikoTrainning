package com.eidiko.niranjana.SpBoot_JdbcTEmplate.testRepo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.eidiko.niranjana.dao.EmployeeDAO;
@SpringBootTest
public class TestEmployeeDAO {

	@Autowired
	private EmployeeDAO empdao;
//====================Employees Count  Test=====================
	@Test
	public void testGetEmpCount()
	{
		int expected=21;
		int actual = empdao.getEmpsCount();
		System.out.println(actual);
		assertEquals(expected, actual);
	}
//====================Insert Employees Test =====================	
	@Test
	public void testInsertEmp()
	{
		String actual = empdao.insertEmp(109," Krishna", "kol");
		System.out.println(actual);
		String expected = "data inserted";
		System.out.println(expected);
		assertEquals(expected, actual);
	}
//====================update Employee Test=====================
	@Test
	public void testUpdatetEmp()
	{
		String actual = empdao.updateEmpDAO(109," Chenna", "kochi");
		System.out.println(actual);
		String expected = "data updated";
		System.out.println(expected);
		assertEquals(expected, actual);
	}
//==================delete Employee Test===============================
	@Test
	public void testDeleteEmp()
	{
		String actual =empdao.deleteEmpDAO(107);
		System.out.println(actual);
		String expected = "data deleted Successfully";
		System.out.println(expected);
		assertEquals(expected, actual);
	}
//=======================Select Operation Test using EmployeeById=========================
	@Test
  public void testSelectOperationUsingById()
  {
		Map<String, Object> actual =empdao.getEmpDetailsDAO(101);
		System.out.println(actual);
		Map<String, Object> expected= Map.of("EID",101,"ENAME","Niranjana","EADDRS","Hyd");
		System.out.println(expected); 
		assertEquals(expected, actual);
  }	 
}
