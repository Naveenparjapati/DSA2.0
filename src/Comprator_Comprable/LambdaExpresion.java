package Comprator_Comprable;



interface Rectangle{
	void area(int a,int b);
}

public class LambdaExpresion{
	public static void main(String[] args) {
		Rectangle a=(s,q)->{
			System.out.println("hello "+s%q);
			};
			
			a.area(12,5);
		}
		
	}