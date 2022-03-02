package com.nt.main;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseOf_ReducedMethod {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("3", "","8", "12", "s", "g", "h");
		
		Optional<String> listname = list.stream().reduce((value,combinedValue)->
													{
														return  value+combinedValue;
													});
		System.out.println(listname.ofNullable(listname));
		listname.isPresent();
		System.out.println(listname.isPresent());

	}

}
