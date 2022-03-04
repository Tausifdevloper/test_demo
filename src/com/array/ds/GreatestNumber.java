package com.array.ds;

import java.util.Arrays;
import java.util.Collections;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={2,1,4,5,7};
		int high=arr.length;
		
		checkGreatest(arr,high);

	}

	private static void checkGreatest(int[] arr, int high) {
		// TODO Auto-generated method stub
		
		int i;
		
		for( i=high-1;i>0;i--)
		{
			if(arr[i]>arr[i-1])
				break;
		}
		int element=arr[i-1],min=i;
		
		for(int j =i+1;j<high;j++)
		{
			if(arr[j]>element && arr[j]<arr[min])
			{
				min=j;
			}
			
		}
		swap(arr, i-1, min);
		//Collections.swap(list, i, j);
		
		Arrays.sort(arr,i,high);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int min) {
		// TODO Auto-generated method stub
		
		int j=arr[i];
		
		arr[i]=arr[min];
		arr[min]=j;
	}

}
