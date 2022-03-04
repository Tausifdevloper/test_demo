package com.array.ds;

import java.util.Arrays;

public class DuplicateNumber {
	
	public static int [] duplicate(int arr[])
	{
		//Arrays.sort(arr);
		int temp[]= new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		//temp[j++] = arr[arr.length-1];  
		int res[]= new int[j];
		for(int i=0;i<j;i++)
		{
			res[i]=temp[i];
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={2,3,4,4,7,8,8};
		
		int [] res=duplicate(arr);
		
		System.out.println("The result of duplicate record is  -->  "+Arrays.toString(res));
		
		
		
	}

}
