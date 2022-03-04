package com.array.ds;

public class StringPalindrome {

	public static void checkPalindrome(String str)
	{
		char ch[]=str.toCharArray();
		int start=0;
		int end =ch.length-1;
		boolean check= true;
		while(end >=start)
		{
			if(ch[end]==ch[start])
			{
				start++;
				end--;
			}
			else
			{
				//System.out.println("NotPalindrome");
				check=false;
				break;
			}
		}
		
		if(check)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="jalaj";
		checkPalindrome(str);

	}

}
