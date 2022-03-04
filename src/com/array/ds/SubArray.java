package com.array.ds;

public class SubArray {
	
	public static int subArray(int arr[],int len)
	{
		/*int max=0,maxsum=0;
		for(int i=0;i<len;i++)
		{
			max+=arr[i];
			if(max<0)
			{
				max=0;
			}
			else if(maxsum<max)
			{
				maxsum=max;
			}
		}
		return maxsum;*/
		
		int max = arr[0];
        int sum = arr[0];
        int i=1;
        while(i < arr.length) {
            max = Math.max(max+arr[i], arr[i]);
            sum = Math.max(max, sum);
            i++;
        }
        return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chk= Math.max(-1+(-2), -1);
		int c =-1 -2;
		System.out.println(c);
		System.out.println(chk);
		int arr[]={-1,-2,-3,-4};
		
		int len=arr.length;
		int result=subArray(arr, len);
		
		System.out.println("The longest subArray --> "+result);

	}

}
