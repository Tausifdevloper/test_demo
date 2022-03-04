package com.array.ds;

public class RectangleOverlape {
	
	private int x;
	private int y;
	

	public RectangleOverlape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
 public static boolean checkOverlap(RectangleOverlape S, RectangleOverlape P,RectangleOverlape S1, RectangleOverlape P1)
 {
	 
	 if(S.x > P1.x || S1.x > P.x)
		 return false;
	 if(S.y <P1.y || S1.y < P.y)
		 return false;
	 return true;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleOverlape S = new RectangleOverlape(0, 4);
		RectangleOverlape P =new RectangleOverlape(2, 3); 
		RectangleOverlape P1 =new RectangleOverlape(5, 2);
		RectangleOverlape S1 =new RectangleOverlape(1, 5);
		System.out.println(checkOverlap(S, P, S1, P1));

	}

}
