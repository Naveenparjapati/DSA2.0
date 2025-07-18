package String_Frequency;


import java.util.HashMap;
import java.util.Map;

public class Frequecy_withoutDefolut {
    public static void main(String[] args) {
        String str = "hello java";

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') continue; // Ignore spaces

            if (freqMap.containsKey(ch)) 
            {
                
                freqMap.put(ch,freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        // Print frequency
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
