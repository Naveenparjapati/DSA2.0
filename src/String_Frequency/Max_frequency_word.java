package String_Frequency;
import java.util.*;
public class Max_frequency_word {


    public static void main(String[] args) {
        String input = "hello world hello java hello code world";

        String[] words = input.split(" ");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            if (freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word) + 1);
            } else {
                freqMap.put(word, 1);
            }
        }

        String maxWord = "";
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.println("Word with max frequency: " + maxWord);
        System.out.println("Frequency: " + maxFreq);
    }
}
