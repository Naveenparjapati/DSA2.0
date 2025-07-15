package patterns;

public class pattern4Butterfly {
   public static void main(String[] args)
   {
	   int n=4;
	   //first part
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("*");
		   }
		   int spaces=2*(n-i);
		   for(int s=1;s<=spaces;s++)
		   {
			   System.out.print(" ");
		   }
		   
		   for(int l=1;l<=i;l++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   
	   //second part
	   for(int i=n;i>=1;i--)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("*");
		   }
		   int spaces=2*(n-i);
		   for(int s=1;s<=spaces;s++)
		   {
			   System.out.print(" ");
		   }
		   
		   for(int l=1;l<=i;l++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
}
//*      *
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *
