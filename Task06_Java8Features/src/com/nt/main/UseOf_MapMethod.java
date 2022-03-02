package com.nt.main;

import java.util.List;
import java.util.stream.Collectors;

public class UseOf_MapMethod {

	public static void main(String[] args) {
	
		
		List<Integer> values = List.of(2,4,6,3);
		//retrieve the data using forEach(-) method
		values.stream().forEach(i->System.out.println(i));
		
		//square the existing data
		List<Integer> newValues=values.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newValues);
		
		//cube the existing data
		values.stream().map(i->i*i*i).forEach(System.out::println);
		System.out.println();
		
		//multiples 3 times  the existing data
			values.stream().map(i->i*3).forEach(System.out::println);
			System.out.println();
//==========================================================================
			
			List<String> names = List.of("india", "japan", "china", "usa", "ireland");
			//retrieve the data using forEach(-) method
			names.stream().forEach(i->System.out.println(i));
			System.out.println();
			
			//retrieve the length of the String
			names.stream().map(str->str.length()).forEach(System.out::println);
	
	}

}
