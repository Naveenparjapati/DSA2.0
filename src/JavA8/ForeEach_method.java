package JavA8;

import java.util.ArrayList;

public class ForeEach_method {
   public static void main(String[] args)
   {
	   ArrayList<Integer> a=new ArrayList<>();
	   a.add(10);
	   a.add(20);
	   a.add(2);
	   a.add(34);
	   a.add(32);
	   
 //*****************Way 1*******************   
	   //fore each loop 1 way
//	   for(int i:a) {
//		   System.out.println(i);
//	   }
	   
 //*****************Way 2*******************
	  // a.forEach(p->System.out.println(p));
	   
	   
//*****************Way 3*******************
	   a.forEach(System.out::println);//forEach method and methos refrence
    }
   
   
}
