package com.imterfaces;

interface TestInterface extends MyInterface
{
   public void display();
   public void show();
}

class InterfaceClass implements TestInterface
{
  public void display()
  {
      System.out.println("implementation of display");
  }
  public void show()
  {
      System.out.println("implementation of show");
  }
  
  
  public void method1()
  {
      System.out.println("implementation of method1");
  }
  public void method2()
  {
      System.out.println("implementation of method2");
  }
  
  public static void main(String arg[])
  {
	  InterfaceClass obj = new InterfaceClass();
      obj. display();
      obj.show();
      obj.method1();
      obj.method2();
  }
}


