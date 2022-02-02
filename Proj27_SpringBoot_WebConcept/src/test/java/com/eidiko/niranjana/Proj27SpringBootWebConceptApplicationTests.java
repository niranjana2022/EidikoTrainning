package com.eidiko.niranjana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.eidiko.niranjana.pratice.CheckValidMobileNumber;
import com.eidiko.niranjana.pratice.CompareMarks;
import com.eidiko.niranjana.pratice.EvenOdd;

@SpringBootTest
class Proj27SpringBootWebConceptApplicationTests {

	private CheckValidMobileNumber number = new CheckValidMobileNumber();
	private CompareMarks marks = new CompareMarks();
	private EvenOdd eo = new EvenOdd();
	
	@Test
	@Disabled
	void contextLoads() {
	}
//==================Checking valid mobile number ====================
	@Test
	public void testValidMob()
	{
		Long actual =number.validMob(9583172160L);
		Long expected = 9583172160L;
		//assertEquals(expected,actual,"This is not my mobile number");
		Assertions.assertThat(actual).isEqualTo(expected);
	}
//============================Compare marks=================
	@Test
	public void testCompareMarks()
	{
		//For java
		float expected = 89.5f;
		float actual = marks.Java(89.5f);
		Assertions.assertThat(actual).isEqualTo(expected);
		//For Advjava
		float expected1 = 89.5f;
		float actual1 = marks.Advjava(89.5f);
		Assertions.assertThat(actual1).isEqualTo(expected1);
		//For JavaScript
		float expected2 = 86;
		float actual2 = marks.JavaScript(86);
		Assertions.assertThat(actual2).isEqualTo(expected2);
		//For Spring
		double expected3 = 89.0f;
		double actual3 = marks.Spring(89.0);
		Assertions.assertThat(actual3).isEqualTo(expected3);
	
	}
	//============================EvenOdd=================
	@Test
	public void testEvenOdd()
	{
		int actual=eo.evenOdd(23);
		if(actual%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		int excepted = 23;
		assertEquals(excepted, actual);
	}
}
