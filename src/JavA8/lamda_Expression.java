package JavA8;


interface rectangle{
	double area();
}

public class lamda_Expression {
public static void main(String[] args)
{
	rectangle r=()->{
		double res=12.5*3;
		return res;
	};
	double w=r.area();
	System.out.print(w);
}
}
