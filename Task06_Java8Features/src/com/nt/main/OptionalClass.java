package com.nt.main;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		
		String str = "Optional class";
		if(str==null)		
		{
			System.out.println("This is null value");
		}
		else
		{
			System.out.println(str.length());
		}
		
//=============================================
		
		String strvalue =null;
	//	Optional<String> optional  = Optional.of(strvalue);
		//System.out.println(optional);
		//System.out.println(optional.isPresent());
		//System.out.println(optional.get());   //" java.lang.NullPointerException
		System.out.println();
		
		
		String str1 ="Morning";
		Optional<String> optional1  = Optional.of(str1);
		System.out.println("optional1 :"+optional1);													//Optional[Morning]
		System.out.println("optional1 :"+optional1.isPresent());							// true
		System.out.println("optional1 :"+optional1.get());  										// Morning
		System.out.println();
		
		
		String str2 =null;
		Optional<String> optional2  = Optional.ofNullable(str2);
		System.out.println("optional2 :"+optional2);																	//	Optional.empty
		System.out.println("optional2 :"+optional2.isPresent());											// false
	//	System.out.println("optional2 :"+optional2.get()); 															 // "main" java.util.NoSuchElementException: No value present
		System.out.println();
		
		String str3 ="Morning";
		Optional<String> optional3  = Optional.ofNullable(str3);
		System.out.println("optional3 :"+optional3);																		//Optional[Morning]
		System.out.println("optional3 :"+optional3.isPresent());												//true
		System.out.println("optional3 :"+optional3.get());  														//Morning
		System.out.println("optional3 :"+optional3.hashCode()); 
		System.out.println();
		
		String str4 =null;
		Optional<String> optional4  = Optional.ofNullable(str4);
		System.out.println("optional4 :"+optional4);																		//Optional.empty
		System.out.println("optional4 :"+optional4.isPresent());												//false
//		System.out.println(optional4.get());  																					//null
		System.out.println("optional4 :"+optional4.orElse(str4));
		System.out.println("optional4 :"+optional4.orElse("no value"));									//no value
		System.out.println("optional4 :"+optional4.hashCode());                                              // 0
		System.out.println("optional4 :"+optional4.equals(str4)); 												//false
	//	System.out.println("optional4 :"+optional4.orElseThrow());										///main" java.util.NoSuchElementException: No value present
		System.out.println();
		
		
		String str5 ="AfterNoon";
		Optional<String> optional5  = Optional.ofNullable(str5);
		System.out.println("optional5 :"+optional5);																		//Optional[AfterNoon]
		System.out.println("optional5 :"+optional5.isPresent());												//true
		System.out.println("optional5:"+optional5.get());  														//AfterNoon
		System.out.println("optional5 :"+optional5.orElse(str5));											//AfterNoon
		System.out.println("optional5 :"+optional5.orElse("no value"));									//AfterNoon
		System.out.println("optional5 :"+optional5.hashCode());                                              // -1271923908
		System.out.println("optional5 :"+optional5.equals(str5)); 								//false
		System.out.println("optional5 :"+optional5.orElseThrow());										//optional5 :AfterNoon
		System.out.println(optional5.toString());																		//Optional[AfterNoon]
		System.out.println(optional5.orElseGet(null));														//AfterNoon
		System.out.println(optional5.empty());																		//Optional.empty(return empty optional instance)
		System.out.println(optional5.isEmpty());                                                                   //false
		//System.out.println(optional5.ifPresent(i->i.endsWith("o")));
		System.out.println();
		
		
	}
}
