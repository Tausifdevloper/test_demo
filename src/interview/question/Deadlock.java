package interview.question;

public class Deadlock {

	 static String res ="Tausif";
	 static String res1="Anwar";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//res ="Henry";
		Thread t1 = new Thread()
				{
					public void run()
					{
						synchronized (res) {
							System.out.println("locked 1");
							
							try{
								Thread.sleep(100);
							}
							catch (Exception e) {
								// TODO: handle exception
							}
						
						
						synchronized (res1) {
							
							System.out.println("locked2");
						}
					}
					}
				};
				
				Thread t2 = new Thread()
				{
					public void run()
					{
						synchronized (res1) {
							System.out.println("locked 2");
							
							try{
								Thread.sleep(100);
							}
							catch (Exception e) {
								// TODO: handle exception
							}
						
						
						synchronized (res) {
							
							System.out.println("locked2");
						}
					}
					}
				};
				
				t1.start();
				res="Javed";
				res1="Akhtar";
				t2.start();

	}

}
