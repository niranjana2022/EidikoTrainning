package com.eidiko.niranjana.main;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hi","hy");
		System.out.println(list);
		String str = String.join(",", list);
		System.out.println(str);

	}

}
