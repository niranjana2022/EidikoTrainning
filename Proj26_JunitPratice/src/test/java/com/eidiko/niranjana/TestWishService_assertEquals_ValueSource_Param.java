package com.eidiko.niranjana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.eidiko.niranjana.service.WishService;

public class TestWishService_assertEquals_ValueSource_Param {

	@Test
	public void testSayHello()
	{
		WishService service = new WishService();
		String actual =service.WishGenerator("raja");
		String expected ="Good morning: raja";
		assertEquals(expected, actual,"Parameter is missingPass some parameter");
	}
	@Test
	public void testSayHello1()
	{
		WishService service = new WishService();
		String actual =service.WishGenerator("sisu");
		String expected ="Good morning: sisu";
		assertEquals(expected, actual,"Parameter is missingPass some parameter");
	}
	
	//@Test                                             //if we use @ParameterizedTest, then @Test not required
	@ParameterizedTest
	@ValueSource(strings= {"raja","sisu"})   //it allows only int or String type
	public void testSayWish(String user)
	{
		WishService service = new WishService();
		assertEquals("Good morning: "+user,service.WishGenerator(user));
	}
}
