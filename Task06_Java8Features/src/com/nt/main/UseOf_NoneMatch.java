package com.nt.main;

import java.util.HashSet;
import java.util.Set;

public class UseOf_NoneMatch {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("mango");
		fruits.add("pineaple");
		fruits.add("grapes");
		System.out.println(fruits);
		System.out.println();
		boolean result = 	fruits.stream().noneMatch(i->i.startsWith("k"));
		System.out.println(result);           //true
		

	}

}
