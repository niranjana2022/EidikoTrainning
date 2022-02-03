package com.eidiko.niranjana.SpBoot_JdbcTEmplate.testRepo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eidiko.niranjana.dao.EmployeeDAO;
import com.eidiko.niranjana.entity.Employee;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("This is EmployeeDAO Test class")
public class TestEmployeeDAO {
	@Autowired
	private EmployeeDAO empdao;
	private Employee emp = new Employee();
	@BeforeEach
	public void setUp()
	{
		System.out.println("TestEmployeeDAO.setUp()");
	}
//====================Employees Count  Test=====================
	@Test
	//@Disabled
	public void testGetEmpCount()
	{
		int expected=19;
		int actual = empdao.getEmpsCount();
		System.out.println(actual);
		assertEquals(expected, actual);
	}
//====================Insert Employees Test =====================	
	@Test
	//@Order(5)
	@DisplayName("Insert method")
	@Tag("dev")
	@RepeatedTest(value=5)
	public void testInsertEmp()
	{
		System.out.println("This is insert method operation");
		List<Object> actual = empdao.insertEmp(113,"Hari4", "hyd5");
		System.out.println(actual);
		List<Object> expected = List.of(113,"Hari4", "hyd5");
		assertEquals(expected, actual);
	}
//====================update Employee Test=====================
	@Test
	//@Order(2)
	@DisplayName("Update method")
	@Tag("dev")
	@Tag("uat")  //This is Repeatable Annotations
	public void testUpdatetEmp(TestInfo info)    //TestInfo is a interface, its impl. classes are uses for keep all information about that current test method..
	{
		System.out.println("This is update method operation");
		System.out.println(info.getTags()+" "+info.getClass()+" "+info.getDisplayName()+" "+info.getTestClass().get().getName()+" "+info.getTestMethod().get().getName());
		List<Object> actual = empdao.updateEmpDAO(109,"Chenna1", "kochi1");
		System.out.println(actual);
		List<Object> expected = List.of(109,"Chenna1", "kochi1");
		System.out.println(expected);
		assertEquals(expected, actual);
	}
//==================delete Employee Test===============================
	@Test
	//@Order(-1)
	@DisplayName("Delete method")
	@Tag("uat")
	public void testDeleteEmp()
	{
		System.out.println("This is delete method operation");
		List<Object> actual =empdao.deleteEmpDAO(113);
		assertNotNull(actual,"input is missing, Check 'deleteEmpDAO' method");
		System.out.println(actual);
		List<Object> expected = List.of(113);
		System.out.println(expected);
		assertEquals(expected, actual);
	}
	@AfterEach
	public void clean()
	{
		empdao=null;
		//actual=expected=null;
		System.out.println("TestEmployeeDAO.clear()");
	}
}
