package com.mausam.collection.list;
import java.util.*;



public class CompCompDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {


	
		
		Employee e1 = new Employee(101,"Sri");
		Employee e2 = new Employee(104,"Ram");
		Employee e3 = new Employee(103,"Chandra");
		Employee e4 = new Employee(102,"Bhagwan");
		Employee e5 = new Employee(105,"Shankar");
		Employee e6 = new Employee(104,"Ram");
		TreeSet t = new TreeSet();
		t.add(e1); t.add(e2); t.add(e3); t.add(e4); t.add(e5); t.add(e6);

	System.out.println(t);
	
	}

}
