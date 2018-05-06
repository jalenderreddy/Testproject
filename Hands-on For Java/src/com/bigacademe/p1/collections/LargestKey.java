package com.bigacademe.p1.collections;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LargestKey { 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String>map=new HashMap<Integer, String>();
        map.put(12, "sai");
        map.put(23, "keerthi");
        map.put(25, "Patte-gyaneshwar");
        map.put(14, "avinash");
        
        int maxkeyInMap=(Collections.max(map.keySet()));                   // This will return max key in the map.
        String maxValueInMap= (Collections.max(map.values()));             // This will return max value in the map.
        for (java.util.Map.Entry<Integer, String> entry : map.entrySet())  // Iterate through map.
        {  
            if (entry.getKey()==maxkeyInMap)
            {
                System.out.println(entry.getValue());     // Print the value with max key.
            }
    	
    		
    }	   
        
	}
}
	 


