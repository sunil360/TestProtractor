package com.exceptionhandling;

public class MultipleCatchBlock
{
	   public static void main(String args[]){
		   int [] arr= {1,2,3,4,5,6,7};
		     
		   try{
		         
		         
		         //System.out.println("First print statement in try block");
		         
		         for( int i=0; i<=8; i++)
		         {
		        	 System.out.println(arr[i]);
		        	 try{
		        		 System.out.println(arr[i]/0);
		        	 }
		        	 
		        	 catch(ArithmeticException e){
		 		        System.out.println("Warning: ArithmeticException");
		 		     }
		         
		        	 
		         }
		     }
		     
		     catch(ArrayIndexOutOfBoundsException e){
		        System.out.println("Warning: ArrayIndexOutOfBoundsException");
		     }
		     catch(Exception e){
		        System.out.println("Warning: Some Other exception");
		     }
		   
		  }
		}