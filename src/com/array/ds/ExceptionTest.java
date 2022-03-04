package com.array.ds;

public class ExceptionTest {

	public static void test() throws Exception
	{
		try
		{
			throw new ArithmeticException("Hi");
		}
		catch(Exception e)
		{
			System.out.println("Hello"+e);
		}
		finally{
			throw new Exception("Finally block");
			//System.out.println("Testing");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

}
