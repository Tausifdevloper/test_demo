package interview.question;

public class Accolite {
	Accolite acc;
	private Accolite()
	{
		System.out.println("Private");
	}
	
	public static Accolite getInstance(Accolite acc)
	{
		if(acc==null)
			synchronized (Accolite.class) {
				
				if(acc==null)
					 acc =new Accolite();
				
			}
		return acc;
	}
	
	
	public static long fab(int num)
	{
		if(num<=1)
		{
			return 1;
		}
		
		return num*fab(num-1);
	}
	
	
	static void reverse(String str)
	{
		if((str==null) || (str.length() <=1))
				{
					System.out.print(str);
				}
		
		else
		{
			System.out.print(str.charAt(str.length()-1));
			
		 reverse(str.substring(0,str.length()-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a' +'b');
		
		long res = fab(5);
		System.out.println(res);
		String str= "GeekG";
		reverse(str);
		
	}

}
