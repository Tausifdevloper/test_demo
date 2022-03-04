package com.array.ds;

public class NegativeNumber {
	
	public static void negativeArray(int arr[],int len)
	{
		int j=0,temp;
		
		for(int i= 0;i<len;i++)
		{
			if(arr[i]<0)
			{
				if(i != j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={2,-4,3,-5,-6,4};
		int len= arr.length;
		negativeArray(arr,len);

	}

}
