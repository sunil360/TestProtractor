package com.finalkeyword;

public class FinalMethod {
	
	final void demo(){
	      System.out.println("XYZ Class Method");
	   }  
	}  
		     
	class ABC extends FinalMethod{  
	   public static void main(String args[]){  
	      ABC obj= new ABC();  
	      obj.demo();  
	   }  
	}

