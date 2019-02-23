package com.finalkeyword;


public class FinalVariable {
	
	
		   final int MAX_VALUE=99;
		   void myMethod(){  
			   
			   System.out.println("This is final value: " +MAX_VALUE);
		      //MAX_VALUE=101;
		   }  
		   public static void main(String args[]){  
			   FinalVariable obj=new  FinalVariable();  
		      obj.myMethod();  
		   }  
		}


