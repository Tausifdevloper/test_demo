package interview.question;

import java.util.HashMap;
import java.util.Map;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Worked in Agile methodology of of code delivery and been adaptive to changing designand requirements fixes";

	  String[] st= str.toLowerCase().trim().split(" ");
		
		HashMap<String,Integer> hm= new HashMap<>();
		
		for(String s: st)
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}
			
			else
			{
				hm.put(s, 1);
			}
		
		
		for(Map.Entry<String, Integer> c:hm.entrySet() )
		{
			if(c.getValue()>1)
				System.out.println(c);
			//System.out.println(c.getKey() +","+c.getValue());
		}
		

	}

}
