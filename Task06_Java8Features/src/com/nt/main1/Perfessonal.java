package com.nt.main1;

public class Perfessonal {

	public static void main(String[] args) 
	{
		Car carName = new Car()
				{
					public void maruti()
					{
						System.out.println("BALENO");
					}
				};
				carName.maruti();
				
	//==================================
				Car carName1 = ()->
												{
													System.out.println("BLUE-BALENO");
													};
													carName1.maruti();
	}

}
