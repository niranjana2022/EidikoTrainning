package com.nt.main1;
public class MethodReference {

	public static void main(String[] args) {
		//==========================Method Reference=========================
		Car carName = FavouriteMovie::moneyHeist;
		carName.maruti();
		//===========================Lambda Expression====================
		Car carName1 = ()->
		{
			System.out.println("ok");
		};
		carName1.maruti();
		//==============================Annonymous Inner class========================
		
		Car carName2 = new Car()
				{
					public void maruti()
					{
						System.out.println("done");
					}
				};
				carName2.maruti();
		
	}
}
