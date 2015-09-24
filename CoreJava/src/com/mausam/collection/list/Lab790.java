package com.mausam.collection.list;
import java.util.*;

/*
 * Set method 
 * and Get method according to index number
 */
public class Lab790 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add("Sri"); list.add("Ram"); list.add("Chandra");
		System.out.println(list);
		list.set(0, "java");
		System.out.println(list);
		Object obj= list.get(2);
		System.out.println(obj);
	}
	
}
