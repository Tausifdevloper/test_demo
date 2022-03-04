package com.array.ds;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
	
	public static void duplicateChar(String str)
	{
		char ch[]=str.toCharArray();
		HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(hm.containsKey(ch[i]))
			{
				hm.put(ch[i],hm.get(ch[i])+1);
			}
			else
			{
				hm.put(ch[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:hm.entrySet())
		{
			System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="aabcdbccdefe";
		duplicateChar(str);

	}

}
