package testYantra;

public class uniqueway41111 
{
    public static int countWay(int n)
    {
	 //base case
	 if(n==0|| n==1)
	 {
		 return 1;
	 }
	 
	 int[] arr=new int[n+1];
	 arr[0]=1;
	 arr[1]=1;
	 for(int i=2;i<=n;i++)
	 {
		 arr[i]=arr[i-1]+arr[i-2];
	 }
	 return arr[n];
 }
   public static void main(String[] args)
   {
	 int n=4;
	 System.out.println("number of ways  "+countWay(n));
	}
}
