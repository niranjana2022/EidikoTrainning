package com.nt.main;
interface delivery
{
	void flipkart();
//	void amazon();
}
//class Shopping implements delivery
//{
//	@Override
//	public void flipkart() 
//	{
//		System.out.println("Taking more time to delivery the product");
//	}
//	@Override
//	public void amazon()
//	{	
//		System.out.println("Taking less time to delivery the product");
//	}	
//}

public class LambdaExpressionClass {
	public static void main(String[] args) {
//		Shopping shop = new Shopping();
//		shop.amazon();
//		shop.flipkart();
//		//=========================================
//		delivery delv;
//		delv=new Shopping();
//		delv.amazon();
//		delv.flipkart();
		//========================================Using Annonymous InnerClass======================
		delivery delv1;
		delv1=new delivery()
				{
						public void flipkart()
						{
							System.out.println("Taking more time to delivery the product");
						}						
				};
				
			//	delv1.amazon();
				delv1.flipkart();
			//===============================================Using Lambda Expression==================			
				delivery delv2;
				delv2=()->System.out.println("ok");
				delv2.flipkart();				
	}
}
