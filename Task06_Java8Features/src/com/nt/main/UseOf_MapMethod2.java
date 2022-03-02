package com.nt.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseOf_MapMethod2 {

	public static void main(String[] args) {
	
//==========================================================================
			
			List<String> names = List.of("india", "japan", "china", "usa", "ireland");
			List<String> newNameList = new ArrayList<String>();
			//Do upperCase without using Stream
			for(String namelist : names)
			{
				 newNameList .add( namelist.toUpperCase());
				
			}
			System.out.println(newNameList);

			
			//retrieve the length of the String
			newNameList	=names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
			System.out.println(newNameList);
	}

}
