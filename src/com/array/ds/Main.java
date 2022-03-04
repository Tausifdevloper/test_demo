package com.array.ds;

public class Main { 
    static void spiralPrint(int m, int n, int matrix[][]) 
    { 
        //Practise Yourself : Write your code Here 
        
      int k=0,j;
      int i=0;
      for( j =k;j<m-1;j++)
      {
    	  System.out.print(matrix[i][j]);
      }
     
      j=m-1;
      
      for(i=0;i<n-1;i++)
      {
    	  System.out.print(matrix[i][j]);
      }
      i=n-1;
      for(j=m-1;j>k;j--)
      {
    	  System.out.print(matrix[i][j]);
      }
      
      j=k;
      
      for(i=m-1;i>k;i--)
      {
    	  System.out.print(matrix[i][j]);
      }
      
      k++;
      m=m-2;
      n=n-2;i++;
      
      for( j =k;j<=m;j++)
      {
    	  System.out.print(matrix[i][j]);
      }
      i++;
      for( j=m;j>=k;j--)
      {
    	  System.out.print(matrix[i][j]);
      }
      
    }
    
  
    public static void main(String[] args) 
    { 
        int R = 4; 
        int C = 4; 
        int matrix[][] = { { 1, 2, 3, 4},
                      {5,6,7,8},
                      { 9, 10, 11, 12}, 
                      { 13, 14, 15, 16 } }; 
        spiralPrint(R, C, matrix); 
    } 
} 