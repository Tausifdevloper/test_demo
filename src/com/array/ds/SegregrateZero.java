package com.array.ds;

import java.util.Arrays;

public class SegregrateZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,0,0,1,2,0,0,0,1,2,2,1};
		int high= arr.length;
		//System.out.println(high);
		segregrateNumber(arr,high);
	}

	private static void segregrateNumber(int[] arr, int high) {
		
		int a=0,b=0,c=0;
		int j=0;
		for(int i =0;i<high;i++)
		{
			if(arr[i]==0)
			{
				a++;
			}
			else if(arr[i]==1)
			{
				b++;
			}
			else
			{
				c++;
			}
		}
		
		while(j <a)
		{
			arr[j]=0;
			j++;
		}
		while(j<a+b)
		{
			arr[j]=1;
			j++;
		}
		while(j<a+b+c)
		{
			arr[j]=2;
			j++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
