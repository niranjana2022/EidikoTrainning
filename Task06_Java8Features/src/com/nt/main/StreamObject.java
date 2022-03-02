package com.nt.main;

import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args)
	{
	//Create Empty Stream...
		Stream<Object> emptystream = Stream.empty();
		emptystream.forEach(e->{
																System.out.println(e);
																});
		
//store data in array and pass that data into Stream and Getting Stream object
		String name[] = {"USA", "RUSSIA","CHINA","JAPAN","GERMANY","ROMAN"};  
		
		//Retrieve data using enhanced for-loop
		for(String i : name)
		{
			System.out.println(i);
		}
		System.out.println();
		//Retrieve data using forEach() method
		Stream<String> stream = Stream.of(name);
		System.out.println(stream);
		stream.forEach(e->System.out.println(e));
		
//store data in array and pass that data into Stream and Getting Stream object
		List<Integer> list3 = List.of(36,46,2,6,7,11,67);
		System.out.println(list3);
		System.out.println();
		//Retrieve data using forEach() method
		Stream<Integer> listout = list3.stream();
		listout.forEach(e->System.out.println(e));
		
	}

}
