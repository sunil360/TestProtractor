package com.imterfaces;

abstract class AbstractDemo{
	   // Concrete method: body and braces
	   public void myMethod(){
	      //Statements here
	   }

	   // Abstract method: without body and braces 
	   abstract public void anotherMethod();
	}

public class AbtractClassExample {
	
	public void myMethod(){
	      System.out.println("Hello");
	   }
	   
	public void anotherMethod()
	{
		System.out.print("Abstract method"); 
		
	}
	   public static void main(String args[])
	   { 
	      //Can't create object of abstract class - error!
		   AbtractClassExample obj = new AbtractClassExample();
	      obj.myMethod();
	      obj.anotherMethod();
	   }
	}


