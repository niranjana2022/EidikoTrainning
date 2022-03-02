package com.nt.main1;
public class UseOf_ConstructorReference {
	public static void main(String[] args) {
		
		Car carName = new Car()
				{
					public void maruti()
					{
						System.out.println("BALENO");		//Annonymous Inner class
					}
				};
			carName.maruti();
	
		Car carName1 = ()->{
															System.out.println("ok");		//Lambda Expression
											};
					carName1.maruti();
					
		Car carName2 = FavouriteMovie::moneyHeist;				//Method reference
		carName2.maruti();
//=====================================================================================================		
		
		Shopping shop1 = ()->
		{
			System.out.println("Best delivery"); 			 //Lambda Expression
			return (Shopping) new FavouriteMovie();
		};
		FavouriteMovie movie =(FavouriteMovie) shop1.favouriteMovieTicket();
		movie.moneyHeist();
		movie.vikings();
		
		
	//	Shopping shop2 = FavouriteMovie::new;					
	//	shop2.favouriteMovieTicket();
	}
}
