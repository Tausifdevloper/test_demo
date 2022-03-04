package com.array.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PairCheckNumber {
	
	public static void printPair(int arr[],int len)
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Inside");
		for(int i=0;i < len;i++)
		{
			if(hm.containsKey(Math.abs(arr[i])))
			{
				hm.put(Math.abs(arr[i]), hm.get(Math.abs(arr[i]))+1);
			}
			else{
				hm.put(Math.abs(arr[i]), 1);
			}
			
			if(hm.get(Math.abs(arr[i]))==2)
			{
				al.add(Math.abs(arr[i]));
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:hm.entrySet())
		{
			System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
		}
		for(int j=0;j<al.size();j++)
		{
			System.out.print("-"+ al.get(j) + " ,"+ al.get(j)+ " ,");
		}
	}
	public static void main(String[] args) {
		
		int[] arr= {1,-1,4,-4,6,7,8};
		
		int len = arr.length;
		
		System.out.println("Hi");
		printPair(arr, len);
		System.out.println("Hello");
		
		
	}

}
