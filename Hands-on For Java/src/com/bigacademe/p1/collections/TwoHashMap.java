package com.bigacademe.p1.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoHashMap {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String>map=new HashMap<String, String>();
		map.put("analyst", "manager");
		
		Map<Integer,Integer>map1=new HashMap<Integer, Integer>();
		map1.put(2000, 5000);
		
		Set<String> Keys = map.keySet();//putting keys in a map
		Iterator<String> ite=Keys.iterator();
		String key=  ite.next();//get one key
		String value= map.get(key);//pass key and get value
		System.out.println("The designation is "+value);
		
		
		Set<Integer> Keys1 = map1.keySet();//putting keys in a map
		Iterator<Integer> ite1=Keys1.iterator();
		int add=5000;
		int add1=5000;
		while(ite1.hasNext()) {
			
		Integer key1=  ite1.next();//get one key
		
		
		Integer value1= map1.get(key1);//pass key and get value
		
		if(key1%1==0 && value1%1==0) {
		add=key1+add;
		add1=value1+add1;
		
		System.out.println("The salary of the manager is "+add1);
			
			
		}
		}
		
	
		
		
		
		
		
		
	}

}
