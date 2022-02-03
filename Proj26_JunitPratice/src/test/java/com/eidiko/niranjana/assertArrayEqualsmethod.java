package com.eidiko.niranjana;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class assertArrayEqualsmethod {

	@Test
	public void testArrayEqualsmethod()
	{
		int expected[] = {10,11,12,13};
		int actual[] = {10,11,12,23};
		assertArrayEquals(expected,actual); //it check the data through the index wise..
	}
}
