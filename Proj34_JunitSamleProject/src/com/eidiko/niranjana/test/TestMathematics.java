package com.eidiko.niranjana.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.eidiko.niranjana.service.Mathematics;

public class TestMathematics {

	@Test
	public void testCalInterest()
	{
		Mathematics mts = new Mathematics();
	Float actual = 	mts.calInterest(100000, 2, 8);
	Float expected=16000.0f;
	assertEquals(expected, actual);
	}
}
