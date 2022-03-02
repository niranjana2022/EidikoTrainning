package com.nt.main;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseOf_ConcatingStream {

	public static void main(String[] args) {
	
		List<String> fruits = Arrays.asList("Mango", "Grapes","Pineapple");
					Stream<String> stream1 = fruits.stream();
		List<String> cars = Arrays.asList("maruti", "hyundai", "xylo");
					Stream<String> stream2 = cars.stream();
		//Concatinate two streams
		List<String>	 finalList=	Stream.concat(stream1,stream2).collect(Collectors.toList());
		for(String listItem : finalList)
		{
			System.out.println(listItem);
		}

	}

}
