package com.nt.main;

import java.util.List;
import java.util.stream.Collectors;

public class UseOf_FilterMethod {

	public static void main(String[] args)
	{
		List<Integer> values = List.of(2,4,6,3,12,24,27,36,41);
		//retrieve the data using forEach(-) method
				values.stream().forEach(i->System.out.println(i));
				System.out.println();
				
		//retrieve Even numbers are
				List<Integer> evenList = values.stream().filter(i->(i%2)!=0).collect(Collectors.toList());
				System.out.println(evenList);
				System.out.println();
				
		//retrieve the  numbers those are greaterthan 30
				List<Integer> greaterNum = values.stream().filter(i->i>30).collect(Collectors.toList());
				System.out.println(greaterNum);
				System.out.println();
//=====================================================================================
		
		List<String> names = List.of("india", "japan", "china", "usa", "ireland");
		//retrieve the data using forEach(-) method
		names.stream().forEach(i->System.out.println(i));
		System.out.println();
				
		//retrieve those country which are starts with "i"
		List<String> countryList = names.stream().filter(i->i.startsWith("u")).collect(Collectors.toList());
		System.out.println(countryList);
		System.out.println();
		

	}

}
