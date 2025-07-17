package PrimeNumbers;

public class Nth_Prime_number {
    
   public static void main(String[] args)
   {
	     
	   int n=4;
		int count=0;
		
			for(int K=2;K<=100;K++) 
			{
				int no=K;
			boolean flag=true;
			for(int i=2;i<=Math.sqrt(no);i++)
			{
				if(no%i==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
			{
				count++;
				if(count==n)
				{
				System.out.println(n+"n is prime "+no);
				break;
				}
			}
		}
		
   }
}
