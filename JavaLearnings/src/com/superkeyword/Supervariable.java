package com.superkeyword;

class Employee
{
float salary=10000;
}
class HR extends Employee
{
float salary=20000;
void display()
{
System.out.println("Salary: "+salary);//print base class salary
}
}
class Supervarible
{
public static void main(String[] args)
{
HR obj=new HR();
obj.display();
}
}