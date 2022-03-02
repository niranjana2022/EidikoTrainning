package com.nt.main;

import java.util.List;
import java.util.stream.Collectors;

public class UseOf_FilterMethod2 {

	public static void main(String[] args) {
	
		
		List<Integer> values = List.of(2,4,6,3,12,45,34,78);
		
		//retrieve the data using forEach(-) method
		values.stream().forEach(i->System.out.println(i));
		
		List<Integer> newValues=values.stream().filter(i->i>30 && i<60).collect(Collectors.toList());
		System.out.println(newValues);
		
		
		List<String> names = List.of("india", null, "china", null, "ireland");
		List<String> newNames=names.stream().filter(i->i!=null).collect(Collectors.toList());
		System.out.println(newNames);
		
		
	
	}

}
