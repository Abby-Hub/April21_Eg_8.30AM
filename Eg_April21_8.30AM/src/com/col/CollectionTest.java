package com.col;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest {

	public static void main(String[] args) {
		List<String> col = new ArrayList<String>();
		col.add("Tiger");
		col.add("Scott");
		col.add("Dev");
		col.add("Sam");
		col.add("Tiger");
		
		System.out.println(col);
		
		System.out.println("*********Iterator***********");
		
		ListIterator<String> itr = col.listIterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println("---------------------------------");
		while(itr.hasPrevious()) {
			String s = itr.previous();
			System.out.println(s);
		}
		
		
		
		System.out.println("*********For Each*********");
		for (String s1 : col) {
			System.out.println(s1);
		}
		
	/*	int size = col.size();
		
	for(int i =0 ; i<size ; i++) {
		System.out.println(col.remove("Tiger"));
	}
		System.out.println(col);*/
		
/*		Collection<String> col2 = new ArrayList<String>();
		col2.add("pen");
		col2.add("book");
		col2.add("laptop");
		col2.addAll(col);
			
		System.out.println(col2);
		
		System.out.println("************************");
		
		col.remove("Tiger");
		col.remove("Tiger");
		System.out.println(col);
		System.out.println(col2);
		System.out.println();
		
		System.out.println("************************");
		
		col2.removeAll(col);
		System.out.println(col);
		System.out.println(col2);
*/		
		
	}

}
