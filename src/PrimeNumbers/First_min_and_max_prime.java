package PrimeNumbers;

import java.util.ArrayList;

public class First_min_and_max_prime {
	public static void PrimrOrNot()
	{
		
		ArrayList<Integer> a1=new ArrayList<>();
	for(int j=2;j<=28;j++)	
	{	
		int n=j;
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			a1.add(n);
		}	
		
	}
	System.out.print("min prime "+a1.get(0)+"max prime "+a1.get(a1.size()-1));
	}
   public static void main(String[] args)
   {
	    
	     PrimrOrNot();
   }
}
