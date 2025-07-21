package JavA8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingFrequencyOfCharacter {
	 public static void main(String[] args)
	  {
		  String input = "programing";

	      Map<Character, Long> frequencyMap = input.chars() 
	          .mapToObj(c -> (char) c).collect(Collectors.groupingBy(
	              Function.identity(),
	              Collectors.counting()
	          ));

	      frequencyMap.forEach((a, b) -> System.out.println(a + ": " + b));
	  }
}
