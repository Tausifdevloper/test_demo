package com.array.ds;

import java.util.Arrays;

public class SmallestNumber {
	
	public static int kthSmallest(int arr[],int l,int r,int k)
	{
		
			
		Arrays.sort(arr);
		return arr[k-1];
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={2,3,4,5};
		int r=arr.length-1;
		int k=3;
		try
		{
		int result=kthSmallest(arr, 0, r, k);
		System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Exception ");
		}
		
		System.out.println("Welcome");

	}

}
