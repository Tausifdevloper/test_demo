package com.array.ds;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1, 8, 3, 0, 2, 0, 1, 10, 13, 0};
		
		 moveZeros(arr);
		

	}

	private static void moveZeros(int[] arr) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			 arr[count++]=arr[i];
			}
			
		}
		
		while(count < arr.length)
		{
			arr[count++]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
