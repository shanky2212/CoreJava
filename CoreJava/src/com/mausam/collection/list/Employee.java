package com.mausam.collection.list;

public class Employee implements Comparable {
	
	private int empID;
	private String name;
	
	public Employee(int empID, String name){		
		this.empID= empID;
		this.name=  name;	}
	
	public String toString(){
		return empID+"------"+name;
	}	
	public int compareTo(Object arg0)	{  
	//Default Natural Sorting order Logic   
		int empID1 = this.empID;		
		Employee e = (Employee) arg0;		
		int empID2 = e.empID;		
		if(empID1>empID2)			
			return +1;			
		else if(empID1<empID2)
			return -1;
		else
			return 0;
	}	}


	
	
	

