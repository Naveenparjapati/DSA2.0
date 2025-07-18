package String_Frequency;

import java.util.HashMap;
import java.util.Map;

public class Array_element_frequency {
	public static void main(String[] args) {
     int[] arr= {1,1,2,3,45,5,6};
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (Integer ch :arr) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print the frequencies
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

 }

}
