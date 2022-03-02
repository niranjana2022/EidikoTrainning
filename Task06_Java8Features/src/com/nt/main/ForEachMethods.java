package com.nt.main;

import java.util.Arrays;
import java.util.List;

public class ForEachMethods {
public static void main(String[] args) {
List<Integer> obj = Arrays.asList(4,3,6,7,2,8,0);
	
	//iterate one by one
	System.out.println(obj.get(0));
	System.out.println(obj.get(1));
	System.out.println(obj.get(2));
	System.out.println(obj.get(3));
	System.out.println(obj.get(4));
	System.out.println(obj.get(5));
	System.out.println(obj.get(6));
	System.out.println();

	//iterate using for-loop
	for(int i=0; i<obj.size();i++)
	{
		System.out.println(obj.get(i));
	}
	System.out.println();
	//iterate using enhanced for-loop
	for(int i : obj)
	{
		System.out.println(i);
	}
	System.out.println();
	//iterate using ForEach() method
	obj.forEach(i->
					System.out.println(i)
					);
}
	
}
