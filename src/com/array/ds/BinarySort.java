package com.array.ds;

public class BinarySort {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,4,12,14,16,20,21};
		
		int key=21;
		int low=0;
		int high= arr.length;
		//System.out.println(high);
		int result =BinarySort.binarySearch(arr,key,low,high);
		
		System.out.println(result);

	}

	private static int binarySearch(int[] arr, int key, int low, int high) {
	
	if(low>high || arr[high-1] < key)
	{
		return -1;
	}
	int mid = low + ((high-low))/2;
	
	if(arr[mid]==key)
	{
		return mid;
	}
	
	else if (key <arr[mid])
	{
		return binarySearch(arr,key,low,mid -1);
	}
	
	else{
		return binarySearch(arr,key,mid +1,high);
	}
		
		
	}

}
