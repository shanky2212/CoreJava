package com.mausam.collection.list;

import java.util.ArrayList;
import java.util.Collection;

/*
 * containsAll method  col1.containsAll(col2)
 * it will give true is all contents of col2 will be available in col1 else false.
 * 
 * 
 */


public class Lab786 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Collection col1 = new ArrayList();
		
		col1.add("Sri"); col1.add("Ram"); col1.add("Chandra"); col1.add("Java"); col1.add("Spring"); col1.add("DotNet");
		
		System.out.println("Size :" +col1.size());
		
		Collection col2 = new ArrayList();
		
		col2.add("Sri");  col2.add("Chandra"); col2.add("Ram"); //col2.add("Pen");
		
		System.out.println("Size :" +col2.size());
		
		Collection col3 = new ArrayList();
		
		col3.add("Sri"); col3.add("Ram"); //col3.add("Chandra"); 
		
		System.out.println("Size :" +col2.size());
		
		System.out.println(col1+"\n"+col2+"\n"+col3);
		
           System.out.println(col1.containsAll(col2));
           System.out.println((col1.containsAll(col3)));
		
	}

}
