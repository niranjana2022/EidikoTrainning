package com.nt.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class ConsImpl implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
			int x = t*t;
			System.out.println(x);
		
	}
	
}
public class ForEachMethods2 {
public static void main(String[] args) {
List<Integer> obj = Arrays.asList(4,3,6,7,2,8,0);
	
	//iterate using ForEach() method
	obj.forEach(t->
					System.out.println(t)
					);
	System.out.println();
	//iterate using ForEach() method with Consumer(I)
	Consumer<Integer>  obj1 = new ConsImpl();
	obj.forEach(obj1);
	//iterate using forEach()
	
	Consumer<Integer> obj2 = new Consumer<Integer>()
			{
				public void accept(Integer t)
				{
					int x = t*t;
					System.out.println(x);
				}
			};
	obj.forEach(obj2);
	
	//=================
	Consumer<Integer> obj3 = (Integer t)->{
		int x = t*t;
		System.out.println(x);
	};
	obj.forEach(obj3);
}
	
}
