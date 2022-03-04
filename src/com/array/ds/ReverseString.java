package com.array.ds;

public class ReverseString {

	
	public static void arrayReverse(int[]arr,int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	
	public static char[] stringReverse(String str)
	{
		char[] ch=str.toCharArray();
		char temp;
		int start=0;
		int end =str.length()-1;
		while(start<end)
		{
			temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		return ch;
	}
	
	public static void printArray(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	public static void printString(char arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,5,3,6,4};
		String str = "Tausif";
		
		char[] ch=stringReverse(str);
		int chSize= ch.length;
		printString(ch,chSize);
		int end=arr.length-1;
		int start=0;
		int size=arr.length;
		//arrayReverse(arr,start,end);
		//printArray(arr,size);
		

	}

}
