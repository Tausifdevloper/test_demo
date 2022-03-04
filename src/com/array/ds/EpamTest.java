package com.array.ds;

import java.util.ArrayList;
import java.util.HashMap;

public class EpamTest {
	
	private int size,front,rear;
	private ArrayList <Integer>ls= new ArrayList();
	
	EpamTest(int size)
	{
		this.size= size;
		this.front=this.rear=-1;
	}
	
	public void insertQueue(int data)
	{
		if((front ==0 && rear== size-1) ||(rear==(front-1)%(size-1)))
		{
			System.out.println("Full of queue");
		}
		else if(front ==-1)
		{
			front =0;
			rear=0;
			ls.add(rear,data);
		}
		else if (rear ==size-1 && front !=0)
		{
			rear=0;
			ls.set(rear, data);
		}
		
		
		else {
			rear=(rear+1);
			
			if(front<=rear)
			{
				ls.add(rear,data);
			}
			
			else
			{
				ls.set(rear, data);
			}
		}
	}
	/*public static void createHashMap(int [] arr,char[]ch)
	{
		HashMap<Character, int[]> hm= new HashMap<>();
		
		int len= arr.length;
		int charlenr= ch.length;
		
		int split= len/charlenr;
		if(len >len-charlenr)
		{
			len= 
		}
		
	}*/

	
	public int  deletequeue()
	{
		int temp;
		
		if(front==-1)
		{
			System.out.println("Empty");
			return -1;
		}
		
		temp=ls.get(front);
		if(front ==rear)
		{
			front=-1;
			rear=-1;
		}
		
		else if(front== size-1)
		{
			front=0;
		}
		else
		{
			front =front+1;
		}
		return temp;
	}
	
	public void display()
	{
		if(front==-1)
		{
			System.out.println("Empty queue");
			return;
		}
		
		System.out.println("Elements in the queue");
		
		if(rear>=front)
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(ls.get(i));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,3,4,5,6,7,12,0};
		char[] ch={'a','b','c'};
		
		EpamTest q = new EpamTest(4);
		q.insertQueue(1);
		q.insertQueue(12);
		q.insertQueue(5);
		q.display();
		
		int x= q.deletequeue();
		if(x!=-1)
		{
			System.out.println("Deleted Element is ");
			System.out.println(x);
		}
		
		q.display();

	}

}
