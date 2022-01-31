package com.eidiko.niranjana.service;

public class EmployeeService2 {

	public float calcEmployeeInterest(float principal, float time, float rate)
	{
		if(principal<=0 || time<=0 || rate<=0)
			                                          throw new IllegalArgumentException("invalid inputs");
		return principal*time*rate/100.0f;
	}
}
