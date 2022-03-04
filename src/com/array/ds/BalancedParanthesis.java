package com.array.ds;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean checkBalanced(String str)
	{
		Stack<Character>stack= new Stack<Character>();
		boolean isBalanced = true;
		
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch =='(' || ch =='{' || ch == '[')
			{
				stack.push(ch);
				continue;
			}
			if(stack.isEmpty())
			{
				isBalanced = false;
				break;
			}
			
			if(ch == ')'){
	            if(stack.peek() == '('){
	                stack.pop();
	                
	            }else{
	            	isBalanced = false;
	                break;
	            }
	        }
			
			if(ch == '}'){
	            if(stack.peek() == '{'){
	                stack.pop();
	                
	            }else{
	            	isBalanced = false;
	                break;
	            }
	        }
			if(ch == ']'){
	            if(stack.peek() == '['){
	                stack.pop();
	                
	            }else{
	            	isBalanced = false;
	                break;
	            }
	        }
			
		}
		
		if(!stack.empty()){
			isBalanced = false;
       } 
		
		return isBalanced;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{([]))";
		boolean result = checkBalanced(str);
		System.out.println("The result is :" + result);

	}

}
