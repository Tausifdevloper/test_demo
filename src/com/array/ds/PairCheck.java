package com.array.ds;

public class PairCheck {
	public static void pairCheck(int arr[],int size,int target)
	{
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+","+arr[j]);
					//return;
					continue;
				}
			}
		}
		System.out.println("No pair found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]=  {-5, 1, -40, 20, 6, 8, 7};
			int target=15;
			int size=arr.length;
			pairCheck(arr, size, target);
	}

}
