package PrimeNumbers;

public class Prime1To100 {

	public static void PrimrOrNot()
	{
		for(int K=2;K<=100;K++) {
			int n=K;
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
			System.out.println("n is prime "+n);
		}
	}
	}
   public static void main(String[] args)
   {
	     
	     PrimrOrNot();
   }
}
