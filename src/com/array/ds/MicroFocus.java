package com.array.ds;

public class MicroFocus implements Runnable  {

	
		// TODO Auto-generated method stub
			int total =10;
			static int num=1;
			int rem;
			static Object lock= new Object();
			static volatile int number=7;
			
		public 	MicroFocus(int rem)
			{
				this.rem=rem;
			}
			
	public static void main(String args[])
	{
		MicroFocus focus1= new MicroFocus(1);
		MicroFocus focus2= new MicroFocus(0);
		//MicroFocus focus3= new MicroFocus(0);
		
		Thread t1= new Thread(focus1);
		Thread t2= new Thread(focus2);
		t1.start();
		t2.start();
		
		new Thread(()->{
			
			System.out.println("Tausif");
			
		}).start();
		
		javac Microfocus.java
		
		java Microfocus
		
		set PATH=c:\prrogra
		
		java.exe -classpath C:\lib\*
	}

	public synchronized static void print()
	{
		while(num<total)
		{
			synchronized(this) {
				while(num%2!=rem)
				{
					try{
						lock.wait();
					}catch(InterruptedException e)
					{
						System.out.println(e);
					}
				}
				
				System.out.println(num);
				num++;
				lock.notifyAll();
			}
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*while(num<total)
		{
			synchronized (lock) {
				while(num%2!=rem)
				{
					try{
						lock.wait();
					}catch(InterruptedException e)
					{
						System.out.println(e);
					}
				}
				
				System.out.println(num);
				num++;
				lock.notifyAll();
			}
		}
		*/
		print();
	}

}
