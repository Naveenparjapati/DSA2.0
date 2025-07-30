package Stackk;

import java.util.Stack;

public class REvStack {
	
	public static void pushAtbott(Stack<Integer> s,int  data) {
		
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		int top=s.pop();
		pushAtbott(s,data);
		s.push(top);
	}
	public static void revStack(Stack<Integer> s) 
	{
		
		if(s.isEmpty())
		{
			return;
		}
		
		
		int top=s.pop();
		revStack(s);
		pushAtbott(s,top);
		
	}
	
	
   public static void main(String[] args)
   {
	   Stack<Integer> s=new Stack<>();
	   s.push(4);
	   s.push(3);
	   s.push(2);
	   s.push(1);
	   revStack(s);
	   
	   
	   while(!s.isEmpty())
	   {
		   System.out.println(s.peek());
		   s.pop();
	   }
   }
}
