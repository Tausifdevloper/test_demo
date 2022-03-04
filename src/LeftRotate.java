import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer>ls= Arrays.asList(1,2,3,4,5);
			rotateList(ls);
	}

	private static void rotateList(List<Integer> ls) {
		// TODO Auto-generated method stub
	
	/*	int tmp= ls.get(0);
		System.out.println(tmp);
		for(int i=0;i<ls.size();++i)
		{
			//	System.out.println(ls.size());ls.set(i, ls.get((i+1))%ls.size());
			System.out.println(ls.get((i+1))%ls.size());
		}
		ls.set(ls.size()-1, tmp);
		//Collections.rotate(ls, -1);
		*/
		
		  /* To get the starting point of
        rotated array */
        int mod = 1 % ls.size();
 
        // Prints the rotated array from
        // start position
        int temp=ls.get(0);
        for (int i = 0; i < ls.size(); ++i)
        	//ls.set(i, ls.get((i + mod) % ls.size()));
           System.out.print(ls.get((i + mod) % ls.size())+ " ");
 
        System.out.println(ls);
        ls.set(4, temp);
        
	}

}
