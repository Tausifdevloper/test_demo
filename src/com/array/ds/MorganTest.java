package com.array.ds;



public class MorganTest
{
	
	public static void searchElement(int[][] array,int len,int res)
	{
		int i=0,j=len-1;
		
		while(i<len && j>=0)
		{
			if(array[i][j]==res)
			{
				System.out.println("element fount "+ i +" "+j);
				return;
			}
			if(array[i][j]>res)
				j--; 
			else
				i++;
		}
		System.out.println("Not found");
		return;
	}
	
	public static void main(String[]args)
	{
		int array[][]={{12,24,25},{34,36,37},{45,56,57}};
		searchElement(array, 3, 34);
		
	}
}