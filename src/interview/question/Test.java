package interview.question;


import java.util.Map;
import java.util.HashMap;
class Test {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int temp=0;
        HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();

        for(int i=0; i<A.length;i++ )
        {
            if(hm.containsKey(A[i]))
            {
                hm.put(A[i],hm.get(A[i])+1);
            }

            else {
                hm.put(A[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry :hm.entrySet())
        {
            if(entry.getKey()== entry.getValue())
            {
                if(entry.getKey() > temp)
                temp = entry.getKey();
            }
        }
		return temp;
    }
        public static void main(String args[])
        {
        	Test t = new Test();
        	int[] A ={3,8,2,3,3,2};
        	int res=t.solution(A);
        	 
        	System.out.println(res);
        	
        }
    
}
