package com.mausam.collection.list;
import java.util.*;

/*
 * indexOf method
 * lastIndexOf
 */
public class Lab791 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add("Sri"); list.add("Ram"); list.add("Chandra");
		list.add("Java"); list.add("DotNet"); list.add("JDBC");
        System.out.println(list);
	    
        int x = list.indexOf("Java");
        System.out.println(x);
		
        int y = list.lastIndexOf("DotNet");
        System.out.println(y);
	}
	}
