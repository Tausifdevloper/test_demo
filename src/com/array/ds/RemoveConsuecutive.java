package com.array.ds;

public class RemoveConsuecutive {
	
	public static String remove(String str)
	{
		
		if(str ==null)
		{
			return null;
		}
		char[] chars = str.toCharArray();
        char prev = 0;
        int k = 0;
 
        for (char c: chars)
        {
            if (prev != c)
            {
                chars[k++] = c;
                prev = c;
            }
        }
 
        return new String(chars).substring(0, k);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "aabbcddd";
		
		System.out.println(remove(str));

	}

}
