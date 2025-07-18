package PrimeNumbers;

import java.util.ArrayList;

public class prime_nth_max_and_min {
	
	public static void main(String[] args)
	   {
		int range=10;
		ArrayList<Integer> a1=new ArrayList<>();
		boolean[] arr=new boolean[range+1];
		
		int n=2;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=true;
		}
		
		
		for(int i=2;i*i<=range;i++)
		{
			if(arr[i])//true
			{
				for(int j=i*i;j<=range;j=j+i)
				{
					arr[j]=false;//<------------------
				}
			}
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i])
			{
				a1.add(i);
			}
		}
		
		System.out.print(a1.get(n-1)+a1.get(a1.size()-n));
		
	   }
}

