package com.eidiko.niranjana.service;

public class EmployeeService {

	public float calcEmployeeInterest(float principal, float time, float rate)
	{
		return principal*time*rate/100.0f;
	}
}
