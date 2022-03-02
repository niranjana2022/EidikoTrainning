package com.nt.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOf_FlatMapMethod {
	public static void main(String[] args) {
		
		//map
		List<Integer> list = Arrays.asList(1,4,5,7,2,5,2); 
		List<Integer> listed = list.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(listed);
		System.out.println();
		
		//flatMap
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(4,7);
		
		List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);
		System.out.println(finalList);
		System.out.println();
	List<Integer> finalResult =	finalList.stream().flatMap(i->i.stream()).map(m->m+10).collect(Collectors.toList());
	System.out.println(finalResult);
		
		
	}
}
