package com.array.ds;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[]={12,21,24,26,35,50,370,2900,10,8,7,6,4};
		int low =0;
		int high= arr.length;
		
		int result=getMaxValue(arr,low,high);
		
		System.out.println(result);
	}

	private static int  getMaxValue(int[] arr, int low, int high) {
		
		if(low == high)
		{
			return arr[low];
		}
		if(high == low+1)
		{
			if(arr[high]>= arr[low])
				return arr[high];
			
		}
		 int mid = (low + high)/2;
		 
		 if(arr[mid]> arr[mid +1] && arr[mid]>arr[mid -1])
		 {
			 return arr[mid];
		 }
		
		 if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid -1])
		 {
			 return getMaxValue(arr, low, mid -1);
		 }
		 else
		 {
			 return getMaxValue(arr, mid+1, high);
		 }
		// TODO Auto-generated method stub
		
	}

}
