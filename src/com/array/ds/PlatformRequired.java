package com.array.ds;

import java.util.Arrays;

public class PlatformRequired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arrival[] ={1.00,1.40,1,50,2.00,2.15,4.00};
		
		double dept[] ={1.10,3.00,2.20,2.30,3.15,6.00};
		
		platformReq(arrival,dept);
	}

	private static void platformReq(double[] arrival, double[] dept) {
		// TODO Auto-generated method stub
		
		int platform=0,maxplatform=0;
		int i=0,j=0;
		Arrays.sort(arrival);
		Arrays.sort(dept);
		while(i <arrival.length-1 && j<arrival.length-1)
		{
			if(arrival[i]<dept[j])
			{
				platform++;
				i++;
				if(platform>maxplatform)
				{
					maxplatform=platform;
				}
			}
			
			else
			{
				platform--;
				j++;
			}
		}
		System.out.println(maxplatform);
		
	}

}
