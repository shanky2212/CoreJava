package com.mausam.collection.list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * retainAll method
 * 
 *
 */


public class Lab788 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Collection col1 = new ArrayList();
		
		col1.add("Sri"); col1.add("Ram"); col1.add("Chandra"); col1.add("Java"); col1.add("Spring"); col1.add("DotNet");
		
		System.out.println("Size :" +col1.size());
		
		Collection col2 = new ArrayList();
		
		col2.add("Sri");  col2.add("Chandra"); col2.add("Ram"); col2.add("Bhagwan");
		
		System.out.println("Size :" +col2.size());
		
		System.out.println(col1+"\n"+col2);
		System.out.println(col1.retainAll(col2));
		System.out.println(col1+"\n"+col2);
		
	}

}
