package com.nt.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataRetrieveFromList_WithUsing_StreamAPI 
{
	public static void main(String[] args) 
	{
		//data insert to list
						//1st way
						List<Integer> list1 = new ArrayList<>();
												list1.add(36);
												list1.add(46);
												list1.add(2);
												list1.add(6);
												list1.add(7);
												list1.add(11);
												list1.add(67);
												
						//2nd way
					    List<Integer>  list2 = Arrays.asList(36,46,2,6,7,11,67);
					
			         //3rd way
					List<Integer> list3 = List.of(36,46,2,6,7,11,67);
					System.out.println(list3);
					System.out.println();
	
					
	//Retrieve the data withOut using StreamAPI
			List<Integer> listEven = new ArrayList<Integer>();
					for(int i : list3)
					{
						if(i%2==0)
						{
							System.out.println(i);
							listEven.add(i);
						}
					}
					System.out.println(listEven);			
					System.out.println();
					
	//Retrieve the data using StreamAPI( findout the Even Number)
					Stream<Integer> stream = list3.stream();
					List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());	
					System.out.println(newList);
				//or
					List<Integer> newList1 = list3.stream().filter(i->i%2==0).collect(Collectors.toList());
					System.out.println(newList1);
	//Retrieve the data using StreamAPI( findout the  Numbers which is GreaterThan 20)
					List<Integer> newList2 = list3.stream().filter(i->i>20).collect(Collectors.toList());
					System.out.println(newList2);
					
	}
}
