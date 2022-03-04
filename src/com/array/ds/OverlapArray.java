package com.array.ds;

import java.util.Arrays;

public class OverlapArray {
	
	public static int[][] merge(int intervals[][])
	{
		Arrays.sort(intervals,new Interval());
		return intervals;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int intervals[][]= new int[5][2];
		
		/*for(int i=0;i<5;i++)
		{
			
		}*/
		
		int intervals[][]={{1,5},{3,6},{8,12},{9,10}};
		int [] [] res=merge(intervals);
		
		for(int arr[]:res)
		{
			System.out.println(Arrays.toString(arr));
		}

	}

}
