package com.nt.main;

import java.util.List;

public class UseOf_CountMethod {

	public static void main(String[] args) {
	
		List<Integer> count = List.of(3,46,7,9,2,7,3);
		Long total = count.stream().filter(i->i%2==0).count();
		System.out.println(total);
		System.out.println();
		
	Long total1 =	count.stream().filter(i->i%2==0).count();
	System.out.println(total1);
	System.out.println();
//==========================================================
	
	List<Integer> list = List.of(3,46,7,9,2,7,3);
	Long distinctTotal = list.stream().distinct().count();
	System.out.println("Total Distinct count:"+distinctTotal);

	}

}
