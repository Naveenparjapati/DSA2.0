package predrivejava;

import java.util.HashMap;
import java.util.Map;

public class Romonto_number13 {
    public static void main(String[] args) {
        String str = "VVVI"; 
        int sum = 0;
        int prev = 0;
        Map<Character, Integer> map = new HashMap<>();
        // Initialize the map with Roman numeral values
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        // Iterate through the Roman numeral string from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);
            int no = map.get(currentChar);
            
            // If the current value is less than the previous value, subtract it
            if (no < prev) {
                sum -= no;
            } else {
                // Otherwise, add it
                sum += no;
            }
            // Update the previous value
            prev = no;
        }
        System.out.print(sum);
    }
}
