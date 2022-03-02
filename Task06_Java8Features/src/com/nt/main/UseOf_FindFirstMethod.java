package com.nt.main;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseOf_FindFirstMethod {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("india", "japan", "china", "usa", "ireland");
		Optional<String> listany = list.stream().findFirst();
		System.out.println(listany.get());

	}

}
