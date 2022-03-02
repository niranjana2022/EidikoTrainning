package com.nt.main;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseOf_ToArraymethod {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("3", "6", "8", "12", "s", "g", "h");
		
		Object arr[] = list.stream().toArray();
		System.out.println(arr.length);
		
		for(Object obj : arr)
		{
			System.out.println(obj);
		}
		System.out.println();

	}

}
