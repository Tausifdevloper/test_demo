package com.array.ds;

import java.lang.reflect.Method;

public class MethodOverideTest extends MethodOveride {
	
	public void sum(int i)
	{
		System.out.println("Child class"+ i);
	}
	
	public void sum (Integer i)
	{
		System.out.println("Integer class" + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MethodOveride over = new MethodOverideTest();
			over.sum(12);
	}

}
