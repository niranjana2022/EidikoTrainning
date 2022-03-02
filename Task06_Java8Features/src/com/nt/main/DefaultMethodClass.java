package com.nt.main;

interface Car
{
	//abstract method
	void hyundai();	
	//default method
	default void performance()
	{
		System.out.println("Good");
	}
	static  void rating()
	{
		System.out.println("5 star");
	}
}
interface Car1
{
	//abstract method
	void hyundai();	
	//default method
	default void performance()
	{
		System.out.println("Good1");
	}
	static  void rating()
	{
		System.out.println("5 star1");
	}
}
class Test1 implements Car,Car1
{

	@Override
	public void hyundai()
	{
	
		System.out.println("Highest selling product1");
	}

	@Override
	public void performance() {
	
		Car.super.performance();
		Car1.super.performance();
	}
	
}


public class DefaultMethodClass {

	public static void main(String[] args)
	{
			Test1 t1 = new Test1();
			t1.hyundai();
			t1.performance();
			Car1.rating();
			Car.rating();

	}

}
