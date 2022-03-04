package com.array.ds;

public class TestOracle {
  
	//int count;
	//static int max ;
	
/*	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0){
		int rem;
		
		rem = num %10;
		rev= rev *10 +rem;
		num =num/10;
		
	}
		return  rev;
	}*/
	
	void rotate (int[] arr,int len)
	{
		int temp;
		 temp =arr[0];
		
		for( int i=0; i<len-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
		arr[len-1]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i>=0;i++)
		{
			System.out.println("Hi Oracle");
		}
		
	/*	int number=123;
		
		int arr[] ={1,2,3,4,5,6,7,8,9};
		// arr[]={9,1,......8};
		//arr={8,9,1...7};
*/	//	System.out.println(reverse(789));
		
		
		
		
		//System.out.println(reverse(-1405));
		
		
	
	}

}
