package com.nt.main;
import java.util.List;
import java.util.Optional;
public class UseOf_Min_MaxMethod {

	public static void main(String[] args) 
	{
		List<Integer> num = List.of(4,9,3,12,19);
		Integer minNum = num.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Minimum number is:"+minNum);
		System.out.println();
		
		//==============================================
		List<Integer> num1 = List.of(4,9,3,12,19);
		Integer maxNum = num1.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Maximum number is :"+maxNum);
		System.out.println();
		//===================================================
		
		List<Integer> num2 = List.of(4,9,3,12,19);
		Optional<Integer> minNum2 = num2.stream().min((x,y)->
																													{
																														return x.compareTo(y);
																													}
																											);
		System.out.println("Minimum2 number is:"+minNum2.get());
		System.out.println();
		
	}
}
