package com.array.ds;

public class RotateArray {
	
	public static void rotate(int arr[],int n)
	{
		int t=arr[n-1];
		
		for(int i=n-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		
		arr[0]=t;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,3,4,5,6};
		int n=arr.length;
		rotate(arr, n);

	}

}
