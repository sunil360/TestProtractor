package com.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
Vector vecobj= new Vector(2,3);

/* Insert the items*/



System.out.println("Size is: "+vecobj.size());
System.out.println("Default capacity increment is: "+vecobj.capacity());

System.out.println("Vector list is: " +vecobj);

/* The the values at specific location*/

vecobj.set(0, "test 0");


System.out.println("Vector list is: " +vecobj);


	}

}
