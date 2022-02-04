package com.eidiko.niranjana;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.SingletonJavaClassService;

public class TestSingletonJavaClass_assertEquals_same_Null_NotNull_fail{

	@Test
	public void testSingleton()
	{
		SingletonJavaClassService service = SingletonJavaClassService.factoryMethod();
		SingletonJavaClassService service1 = SingletonJavaClassService.factoryMethod();
		//assertEquals(service,service1);
		//assertSame(service,service1);
		//Assertions.assertNotNull(service);
		//assertNull(service);
		
		if(service==null || service1==null)
		{
			fail("You have not passed any value, pls check for any input missing/object creation did not happen");
		}
		
		
	}
}
