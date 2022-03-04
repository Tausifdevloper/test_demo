package com.array.ds;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] ={1,2,3,4,6,7,8,9};
			
			int n = arr.length;
			missingNumber(arr,n);
	}

	private static void missingNumber(int[] arr, int n) {
		// TODO Auto-generated method stub
		int sum= (n*(n+1))/2;
		
		int sumOoArray =0;
		for(int i=0;i<n-1;i++)
		{
			sumOoArray +=arr[i];
		}
		System.out.println(sum -sumOoArray);
		
		
		
	}

}
