package com.nt.main;

import java.util.List;
import java.util.stream.Collectors;

public class UseOf_LimitMethod {

	public static void main(String[] args) {
	
		List<Integer> list = List.of(3,46,7,9,2,7,3);
		List<Integer> limitList = list.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitList);
		System.out.println();
		
		//only printing, not storing
		 list.stream().limit(3).forEach(d->System.out.println(d));
		 System.out.println();
//==========================================================
		 List<String> names = List.of("india", "japan", "china", "usa", "ireland");
		 List<String> limitList1 = names.stream().limit(3).collect(Collectors.toList());
			System.out.println(limitList1);
			System.out.println();
			
			//retrieve the data using forEach(-) method
			names.stream().limit(3).forEach(i->System.out.println(i));
			System.out.println();
	}
}
