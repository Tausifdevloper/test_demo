package com.array.ds;

import java.util.HashSet;

public class UnionArray {

	public static int unionCheck(int arr[],int arrlength,int arrlen[],int arrlen1)
	{
		//HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		
		HashSet<Integer>hm= new HashSet<Integer>();
		
		for(int i=0; i<arrlength;i++)
		{
			hm.add(arr[i]);
		}
		
		for(int i=0; i<arrlen1;i++)
		{
			hm.add(arrlen[i]);
		}
		
		return hm.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[]={2,4,1,4,3,5};
		int arrlen[]={5,6,7,3,2,3,1};
		int arrlength=arr.length;
		int arrlen1=arrlen.length;
		
		int count=unionCheck(arr, arrlength, arrlen, arrlen1);
		
		System.out.println("The union count is "+count);
		
	}

}
