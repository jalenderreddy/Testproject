package com.bigacademe.p1.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map=new LinkedHashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(-1, "pqr");
		map.put(0, "abc2");
		map.put(100, "fgh");
		map.put(98,"ghd");
		System.out.println(map);
		
		System.out.println("The size is"+map.size());
		Set Keys = map.keySet();//putting keys in a map
		Iterator ite=Keys.iterator();
		while(ite.hasNext()) {
			Object key=ite.next();//get one key
			Object value=map.get(key);//pass key and get value
			System.out.println(key+"  "+value);
		}
		
	}

}
