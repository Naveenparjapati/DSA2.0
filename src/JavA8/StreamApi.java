package JavA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
  public static void main(String[] args)
  {
	  ArrayList<Integer> a=new ArrayList<>();
	   a.add(10);
	   a.add(20);
	   a.add(2);
	   a.add(34);
	   a.add(32);
	   a.add(32);
	  //1. //Create stream and print the value one by one
	   Stream<Integer> s=a.stream();
	   
	  // s.forEach(w->System.out.println(w));
	   //or
	 //  s.forEach(w->System.out.println(w));
	   
	   
	  //2. //remove duplicate from stream and print 
	 //  a.stream().distinct().forEach(System.out::println);
	   
	  //3.odd number printing from stream
	  // a.stream().map(e->e%2==0).forEach(System.out::println);
	   
	 //4. for all number add 5 and print
	 //  a.stream().map(e->e+5).forEach(System.out::println);
	   
	 //5. remove duplivate and print in assending order 
	   // convert inito new array list collection 
	   // and add new collection into original collection
	   
//	  List<Integer> q=a.stream().distinct().sorted().collect(Collectors.toList());
//	  a.clear();
//	  a.addAll(q);
//	  System.out.print(q);
	   
	   //6. aconvert array into Stream remove duplicate and print
	   int[] arr= {78,7,5,84,78};
	   Arrays.stream(arr).distinct().forEach(System.out::println);
  }
}
