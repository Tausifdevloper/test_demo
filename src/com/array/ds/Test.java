package com.array.ds;

public class Test extends demo {
	
	public void set(int a)
	{
		this.a =a;
		
		System.out.println(a);
	}
	
	public void get()
	{
		a=+a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t= new Test();
		t.set(20);
		t.get();

	}

}
