package com.col;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
			Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
			map1.put(115, "Scott");
			map1.put(102, "Dev");
			map1.put(106, "Sam");
			map1.put(116, "Tiger");
			map1.put(109, "Fana");
			System.out.println("Map 1 : "+map1);
			
			System.out.println(map1.get(115));
			
			System.out.println("Map 1 : "+map1);
			
			
			Set<Integer> keys = map1.keySet();
			System.out.println(keys);
			System.out.println("*********** For Each ************");
			for (int  i : keys) {
				System.out.println(i+"---> "+map1.get(i));
			}
	/*		
			Map<Integer, String> map2 = new TreeMap<Integer, String>();
			map2.put(201, "Book");
			map2.put(202, "Pen");
			map2.put(203, "Laptop");
			map2.putAll(map1);
			System.out.println("Map 2 : "+map2);*/
			
	}

}
