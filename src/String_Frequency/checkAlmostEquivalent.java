package String_Frequency;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        // Frequency arrays for each character
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        // Count the frequency of each character in word1
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        // Count the frequency of each character in word2
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }
        // Check the frequency differences
        for (int i = 0; i < 26; i++) {
            // Calculate the difference between the frequencies
            int difference = Math.abs(freq1[i] - freq2[i]);
            if (difference > 3) {
                return false; // If any difference exceeds 3, return false
            }
        }
        return true; // If all differences are within the limit, return true
    }
}