package predrivejava;

public class Sortest_path {

	public static double getShortestPath(String str)
	{
		int x=0;
		int y=0;
		
		for(int i=0;i<str.length();i++)
		{
			char dir=str.charAt(i);
			//south
			if(dir=='S') {
				y--;
			}
			else if(dir=='N'){//Nort
				y++;
			}else if(dir=='W') {//West
				x--;
				
			}else {//East
				x++;
			}
		}
		
		
		int X2=x*x;
		int Y2=y*y;
		
		return (double) Math.sqrt(X2+Y2);
	}
	public static void main(String[] args)
	{
		String str="NS";
		System.out.print( getShortestPath(str));
	}
	
}
