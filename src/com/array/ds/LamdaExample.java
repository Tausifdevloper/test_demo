package com.array.ds;

import java.util.ArrayList;
import java.util.List;

public class LamdaExample {

	public static void main(String args[])
	{
		List<Double>ls= new ArrayList<>();
		ls.add(1.2);
		ls.add(2.5);
		ls.add(3.4);
		
		 double ds= ls.stream().mapToDouble(x->x).sum();
		 System.out.println(ds);
	}
}
