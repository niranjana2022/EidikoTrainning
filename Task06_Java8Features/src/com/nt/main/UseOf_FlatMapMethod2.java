package com.nt.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOf_FlatMapMethod2 {
	public static void main(String[] args) {
		
	
		//flatMap
		List<String> team1 = Arrays.asList("kalia", "balia", "jaga"); 
		List<String> team2 = Arrays.asList("sosa", "rama", "hari"); 
		List<String> team3 = Arrays.asList("laxman", "trinath", "krushna"); 
		
		List<List<String>> worldCupTeam = new ArrayList<List<String>>();
		worldCupTeam.add(team1);
		worldCupTeam.add(team2);
		worldCupTeam.add(team3);
		//Before java8
		for(List<String> list : worldCupTeam)
		{
			for(String listed : list)
			{
				System.out.println(listed);
			}
		}
		
		//using flatMap() method
		List<String> listedTeam = worldCupTeam.stream().flatMap(str->str.stream()).collect(Collectors.toList());
		System.out.println(listedTeam);
		
	}
}
