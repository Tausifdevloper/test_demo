package com.array.ds;

public class FindCelebarity {

	static int matrix[][] = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };

	public static boolean knows(int a,int b)
	{
		boolean result =(matrix[a][b]==1) ? true : false;
		return result;
	}
	public static int findcelebarity(int n)
	{
		int a =0;
		int b=n-1;
		while(a < b)
		{
			if(knows(a,b))
			{
				a++;
			}
			
			else {
				b--;
			}
		}
		for (int i = 0; i < n; i++)  
			        { 
		            if (i != a && (knows(a, i) || !knows(i, a))) 
			                return -1; 
			        } 
			        return a; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		
		int result = findcelebarity(n); 
		        if (result == -1)  
	        { 
			            System.out.println("No Celebrity"); 
		        }  
		       else
			            System.out.println("Celebrity is " + result); 
		    } 
	}

