package String_Frequency;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_words_in_string {
	public static void main(String[] args) {
        String str = "hi java hi hello";
        String[] stA=str.split(" ");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String ch :stA) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print the frequencies
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

 }
}
