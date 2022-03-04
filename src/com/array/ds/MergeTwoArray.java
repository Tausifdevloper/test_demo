package com.array.ds;

import java.util.Arrays;

public class MergeTwoArray {
	
	public static void merge(int[]arr1,int[]arr2,int n,int m)
	{
		int i=0;
		int j=0;
		int k=n-1;
		
		while(i<=k && j<m)
		{
			if(arr1[i]<arr2[j]){
				i++;
				continue;
			}
			
			else
			{
				int temp=arr1[k];
				
				arr1[k]=arr2[j];
				arr2[j]=temp;
				k--;
				j++;
				
			}
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr1[] = {1, 3, 5, 7};
		int arr2[] = {0, 2, 6, 8, 9};
		
		int n=arr1.length;
		int m=arr2.length;
		merge(arr1, arr2, n, m);
		
		for (int i=0;i<n;i++)
		{
			System.out.print(arr1[i]);
		}
		
		for (int i=0;i<m;i++)
		{
			System.out.print(arr2[i]);
		}

	}

}
