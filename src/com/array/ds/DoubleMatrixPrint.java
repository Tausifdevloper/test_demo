package com.array.ds;

import java.util.Arrays;

public class DoubleMatrixPrint {

	static int len= 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  arr[][]= {{1,2,3,4},{5,6,7,8,9},{10,11,12,13},{14,15,16,17}};
			arrayPrint(arr);
	}
	private static void arrayPrint(int[][] arr) {
		// TODO Auto-generated method stub
		int res[][]=new int[4][4];
		for(int i=0;i<len;i++)
		{
			System.out.print("{");
			for(int j=0;j<len;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.print("}");
			System.out.println(" ");
		}
		
		for(int k=0;k<len;k++)
		{
			for(int l=0;l<len;l++)
			{
				//System.out.print(arr[l][k]);
				res[k][l]=arr[len-l-1][k];
			}
			//System.out.println(" ");
		}
		
		System.out.println("Rotated matrix");
		for(int i=0;i<len;i++)
		{
			System.out.print("{");
			for(int j=0;j<len;j++)
			{
				System.out.print(res[i][j]);
			}
			System.out.print("}");
			System.out.println(" ");
		}
		//System.out.println(Arrays.toString(res));
	}

}
