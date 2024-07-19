package neetcode;

import java.util.Arrays;

public class IsAnagram {

    // Method to check if two strings are anagrams
    public boolean isAnagram(String s, String t) {
        // Compare sorted versions of both strings
        return sortString(s).equals(sortString(t));
    }

    // Helper method to sort characters in a string
    private String sortString(String str) {
        // Remove any spaces and convert the string to a char array
        char[] charArray = str.replaceAll(" ", "").toCharArray();
        // Sort the char array
        Arrays.sort(charArray);
        // Convert the sorted char array back to a string
        return new String(charArray);
    }

    // Main method to test isAnagram
    public static void main(String[] args) {
        // Create an instance of IsAnagram
        IsAnagram isAnagram = new IsAnagram();

        // Sample pairs of strings to test
        String[] test1 = { "racecar", "carrace" }; // Both strings are anagrams
        String[] test2 = { "jar", "jam" }; // Strings are not anagrams

        // Test the isAnagram method with the sample strings
        boolean result1 = isAnagram.isAnagram(test1[0], test1[1]);
        boolean result2 = isAnagram.isAnagram(test2[0], test2[1]);

        // Print the results
        System.out.println("Test 1 (should be true): " + result1); // Test with anagrams
        System.out.println("Test 2 (should be false): " + result2); // Test with non-anagrams
    }
}

// Time Complexity: O(n log n)
// - Sorting each string takes O(n log n), where n is the length of the string.
// - Therefore, the time complexity is O(n log n) for the isAnagram method, where n is the length of the longer string.

// Space Complexity: O(n)
// - The space complexity is O(n) due to the additional space used to store the char array during sorting.
