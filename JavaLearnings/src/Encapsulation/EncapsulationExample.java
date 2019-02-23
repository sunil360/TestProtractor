package Encapsulation;

public class EncapsulationExample {
	
	private int a=10;
	private int b=20;
	private int c=30;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void Display()
	{
		System.out.println(a);
	}

}
