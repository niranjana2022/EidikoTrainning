package com.nt.main;

import java.util.HashSet;
import java.util.Set;

public class UseOf_AnyMatchMethod {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("mango");
		fruits.add("pineaple");
		fruits.add("grapes");
		System.out.println(fruits);
		System.out.println();
		boolean result = 	fruits.stream().anyMatch(i->i.startsWith("m"));
		System.out.println(result);
		

	}

}
