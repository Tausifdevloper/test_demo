package com.array.ds;

public class SegregrateArray {
	
	public static void sort012(int arr[],int n)
	{
		int first=0; int mid=0; int last=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				first++;
			}
			else if(arr[i]==1)
			{
				mid++;
			}
			else
			{
				last++;
			}
		}
		 System.out.println(first+""+mid+""+last);
		for(int j=0;j<first;j++)
		{
			arr[j]=0;
		}
		
		for(int k=first;k<first+mid;k++)
		{
			arr[k]=1;
		}
		for(int j=mid+first;j<first+mid+last;j++)
		{
			arr[j]=2;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,0,1,2,0,1,1,2,0};
		int n= arr.length;
		sort012(arr,n);

	}

}
