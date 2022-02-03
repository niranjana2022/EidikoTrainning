package com.eidiko.niranjana;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.JdbcConClassService;

public class TestJdbcConClassservice_failMethod {
	@Test
	public void testAssertSamemethod()
	{
		int expected = 10;
		int actual = 10;
		assertSame(expected,actual); //this method will check either two object references are pointing 
	}                                                                   //to same object or not..if yes, test pass...else fail
	
	@Test
	public void testJdbcConTest()
	{
		Connection expected=JdbcConClassService.getCon();
		Connection actual=JdbcConClassService.getCon();
		/*
		 * if(expected==null || actual==null) { fail("Check may be one value is null");
		 * }
		 */
		assertNotNull(actual);
	}
}
