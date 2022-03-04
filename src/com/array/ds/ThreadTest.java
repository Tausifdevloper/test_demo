package com.array.ds;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//ThreadTest thread1 = new ThreadTest();
		Thread t2 = new Thread(t1);
		t2.start();
		

	}

}
