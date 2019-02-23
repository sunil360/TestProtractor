package Constructors;

public class StaticTest
{
     /* See below - I have marked the constructor as static */
     public static StaticTest()
     {
         System.out.println("Static Constructor of the class");
     }
     public static void main(String args[])
     {
         /*Below: I'm trying to create an object of the class
         which would intern call the constructor*/
         StaticTest obj = new StaticTest();
     }
     
}