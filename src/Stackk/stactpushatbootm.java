package Stackk;
import java.util.Stack;
public class stactpushatbootm {
	 public static void main(String[] args) 
	 {
		 Stack<Integer> s=new Stack<>();
		 s.push(1);
		 s.push(2);
		 s.push(3); 
		 pushAtbottom(s,4);
		 
		 while (!s.isEmpty()) {
	            System.out.println(s.peek());
	            s.pop();
	        }
	 }

	private static void pushAtbottom(Stack<Integer> s, int data)
	{
		//2222222222
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		
		//1111111111111
		int top=s.pop();
		pushAtbottom(s, data);
		s.push(top);		
	}
}
