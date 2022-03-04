package com.array.ds;

public class Stock {
	
	public static int maxProfit(int arr[])
	{
		
		int maxProfit=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int profit=arr[j]-arr[i];
				if(profit>maxProfit)
				{
					maxProfit=profit;
				}
			}
		}
		
		return maxProfit;
	}
	
	public static int checkProfit(int arr[])
	{
		
		int minprice=Integer.MAX_VALUE;
		int maxprice=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<minprice)
				minprice=arr[i];
			else if(arr[i]-minprice>maxprice)
				maxprice=arr[i]-minprice;
		}
		return maxprice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[]={7,5,3};
		int res=maxProfit(arr);
		
		int minprice = Integer.MAX_VALUE;
		
		System.out.println(minprice);
		
		System.out.println("The profit is  "+ res);
		
		int checkpr=checkProfit(arr);
		
		System.out.println(checkpr);
		
	}

}
