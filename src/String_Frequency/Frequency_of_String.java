package String_Frequency;


import java.util.HashMap;
import java.util.Map;

public class Frequency_of_String {
    public static void main(String[] args) {
        String input = "hello java";
//order use LinkedHash
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // Skip spaces
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the frequencies
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
