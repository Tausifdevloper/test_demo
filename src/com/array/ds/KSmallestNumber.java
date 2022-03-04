package com.array.ds;

import java.util.Arrays;

public class KSmallestNumber {
	
	public static int findkthElement(int []arr,int low,int high,int k)
	{
		if(k>0 && k<= high -low+1)
		{
			int index = divideArray(arr,low,high);
			
			if(index-low ==k-1)
			{
				return arr[index];
			}
			if(index -low > k-1)
			{
				return findkthElement(arr,low,index -1 ,k);
			}
		}
		
		
		
		return -1;
	}

	private static int divideArray(int[] arr, int low, int high) {
		
		
		// TODO Auto-generated method stub
		
		int pivot = arr[high];
		int	i=low;
		for(int j=low;j<=high-1;j++)
		{
			if(arr[j]<= pivot)
			{
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];arr[i]= arr[high];
		arr[high] = temp;
		
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = {2,12,98,78,23,45,34,90,55};
		//Arrays.sort(num);
		int len = num.length -1 ;
		int k =1;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		int res = findkthElement(num,0,len,k);
		System.out.println(res);
		
	}

}
