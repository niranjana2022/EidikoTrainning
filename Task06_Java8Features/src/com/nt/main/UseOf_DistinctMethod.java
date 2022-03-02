package com.nt.main;

import java.util.List;
import java.util.stream.Collectors;

public class UseOf_DistinctMethod {

	public static void main(String[] args) {
	
		List<Integer> list = List.of(3,46,7,9,2,7,3);
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		System.out.println();
		
		//only printing, not storing
		 list.stream().distinct().forEach(d->System.out.println(d));
		
	}
}
