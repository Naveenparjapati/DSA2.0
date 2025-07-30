package Stackk;

import java.util.Stack;

public class REverString {
	
	public static String reverseString(String str)
	{  
		Stack<Character> s = new Stack<Character>();
		
		for (int ind = 0; ind < str.length(); ind++)
		{ 
			s.push(str.charAt(ind));
		}
		
		StringBuilder sb = new StringBuilder();
		
		while (!s.isEmpty()) 
		{
			char ch = s.pop();
			sb.append(ch);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) 
	{  
		System.out.print(reverseString("abc"));  
	}
}
