package com.array.ds;

import java.util.Comparator;

public class Interval implements Comparator<int[]> {


	@Override
	public int compare(int[] o1, int[] o2) {
		// TODO Auto-generated method stub
		return o1[0]-o2[0];
	}

}
