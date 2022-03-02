package com.nt.main;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseOf_SortedMethod {

	public static void main(String[] args) {
		
		List<Integer> num = List.of(4,9,3,12,19);
		List<Integer> sortedNum = num.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNum);		//bydefault is Ascending order
		System.out.println();
		
		List<Integer> sortedNum1 = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedNum1);		// Descending order
		System.out.println();
//=================================================================
		List<String> name = List.of("india", "japan", "china");
		List<String> sortedName = name.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedName);			//bydefault is Ascending order
		System.out.println();
		
		name.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		List<String> nam1e = List.of("india", "japan", "china");
		List<String> sortedName1 = name.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedName1);			//Descending order
		System.out.println();


	}

}
