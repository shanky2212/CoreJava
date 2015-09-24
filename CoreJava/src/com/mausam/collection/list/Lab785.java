package com.mausam.collection.list;

import java.util.*;
/*
 * 
 * col1.addAll(col2); this will add all the elements of second collection as separate elements.
 * 
 */

public class Lab785 {

	public static void main(String[] args) {
		

	Collection col1 = new ArrayList();
	
col1.add("Sri"); col1.add("Ram"); col1.add("Chandra");
	
	System.out.println("Size :" +col1.size());
	
	Collection col2 = new ArrayList();
	
	col2.add("Java"); col2.add("DotNet"); col2.add("Spring");
			
	col1.addAll(col2);
		

	System.out.println("Size :"+col1.size());
	System.out.println("Size :"+col2.size());
	
	System.out.println(col1);
	System.out.println(col2);
	
		
	}

}
