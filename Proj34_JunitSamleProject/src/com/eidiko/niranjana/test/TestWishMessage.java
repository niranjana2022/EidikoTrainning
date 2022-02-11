package com.eidiko.niranjana.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.WishMessage;

public class TestWishMessage {

	@Test
	public void testWishMethod()
	{
		WishMessage wish = new WishMessage();
		String actual = wish.WishMethod("Ram");
		System.out.println(actual);
		String expected="Good Mornig: Ram";
		System.out.println(expected);
		assertEquals(expected, actual);
				
	}
}
