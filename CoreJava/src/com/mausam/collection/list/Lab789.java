package com.mausam.collection.list;

import java.util.*;

public class Lab789 {
/**
 *  Index insertion 
 *  and removal
 *  
 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List list = new ArrayList();
		list.add("Sri"); list.add("Ram"); list.add("Chandra");
		System.out.println(list);
		list.add(0, "Java");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
	}
}
