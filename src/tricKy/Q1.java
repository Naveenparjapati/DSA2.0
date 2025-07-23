package tricKy;

public class Q1 {
	 public static void main(String[] args) {
//	        int x = 3, y = 5, result = 0;
//
//	        if (x % 2 == 1) {
//	            if (y % 2 == 1)
//	                result = 1;
//	        } else
//	            result = 2;
//
//	        System.out.println("Result: " + result);// here output is 1
		 
		 
//**********here notice  nested if 2if condition ifas false or not else block then no else will execute************
		 
		 int x = 3, y = 6, result = 0;

	        if (x % 2 == 1) 
	        {
	            if (y % 2 == 1)
	            {
	                result = 1;
	            }
	        } else {
	            result = 2;
	        }

	        System.out.println("Result: " + result); //here output is 0
	 }
}
