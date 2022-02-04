package com.eidiko.niranjana.service;

public class SingletonJavaClassService {

	private static SingletonJavaClassService INSTANCE= new  SingletonJavaClassService();
	private SingletonJavaClassService()
	{
		System.out.println("SingletonJavaClass.SingletonJavaClass()");
	}
	public static  SingletonJavaClassService factoryMethod()
	{
		return INSTANCE;
	}
}
