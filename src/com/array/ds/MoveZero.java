package com.array.ds;

import java.util.Arrays;

public class MoveZero {
	
	private static void moveZeros(int []arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		while(count<arr.length)
		{
			arr[count++]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,4,54,2,0,0,34,23,0};
		moveZeros(arr);

	}

}
