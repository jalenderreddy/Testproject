package com.bigacademe.p1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AverageOddKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Map<Integer,Integer> map=new HashMap<Integer,Integer>();
   map.put(12, 90);
   map.put(35, 90);
   map.put(33, 90);
   map.put(56, 88);
	   
		System.out.println("The size of the map is"+map.size());
		System.out.println("The elements in the map are"+map);
		
		
		Set<Integer> Keys = map.keySet();//putting keys in a map
		Iterator<Integer> ite=Keys.iterator();
		int total=0;
		int count=0;
		while(ite.hasNext()) {
			
			Integer key=  ite.next();//get one key
			Integer value= map.get(key);//pass key and get value
			
			if(key%2 != 0) {
				count++;
				total=total+value;
				
				
			}
			
	}
		System.out.println("The average is"+(total/count));	
}
}

