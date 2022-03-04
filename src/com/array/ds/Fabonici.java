package com.array.ds;

public class Fabonici {

	 static int fib(int n) 
	    { 
	 	        if (n <= 1) 
	 	            return n; 
		        return fib(n - 1) + fib(n - 2); 
	     } 
	   
	     static int countWaysOfStairCase(int s) 
	     { 
	        return fib(s + 1); 
	    } 
	  
	     public static void main(String args[]) 
	     { 
	         int s = 2; 
	         System.out.println("Ways = " + countWaysOfStairCase(s)); 
	 	    } 
	 }


