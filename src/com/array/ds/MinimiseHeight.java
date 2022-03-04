package com.array.ds;

import java.util.Arrays;

public class MinimiseHeight {
	
	public static int getMinDiff(int arr[],int n,int k)
	{
		
		 int min;
	        int max;
	        int res;
	        Arrays.sort(arr);
	        res = arr[n-1] - arr[0];
	        for(int i=1;i<n;i++){
	            if(arr[i]>=k){
	            max = Math.max(arr[i-1]+k, arr[n-1]-k);
	            min = Math.min(arr[i]-k, arr[0]+k);
	            res = Math.min(res,max-min); 
	            }
	           else{
	               continue;
	           }
	           
	        }
	        return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={3,9,12,16,20};
		int k=3;
		int n=5;
		int res=getMinDiff(arr,n,k);
		
		System.out.println(res);

	}

}
