package Constructors;

class Human
{
        String s1, s2;
        public Human()
        {
              s1 ="Super class";
              s2 ="Parent class";
        }
        public Human(String str)
        {
               s1= str;
               s2= str;
        }
}
class ConstructorExample1 extends Human
{
        public ConstructorExample1()
        {
              //s2 ="child class";
        }
        public void disp()
        {
               System.out.println("String 1 is: "+s1);
               System.out.println("String 2 is: "+s2);
        }
        public static void main(String args[])
        {
        	ConstructorExample1 obj = new ConstructorExample1();
                obj.disp();
        }
}