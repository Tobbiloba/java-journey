package neetcode;

import java.util.HashSet;

public class HasDuplicate {

    // Method to check for duplicates in an array
    public boolean hasDuplicateMethod(int[] nums) {
        // Create a HashSet to store the elements we have seen so far
        HashSet<Integer> seenNumber = new HashSet<>();

        // Iterate over each number in the array
        for (int num : nums) {
            // Check if the number is already in the HashSet
            if (seenNumber.contains(num)) {
                // If found, return true indicating a duplicate
                return true;
            }
            // Add the number to the HashSet
            seenNumber.add(num);
        }

        // If no duplicates are found, return false
        return false;
    }

    // Main method to test the hasDuplicateMethod
    public static void main(String[] args) {
        // Create an instance of HasDuplicate
        HasDuplicate hasDuplicate = new HasDuplicate();

        // Sample array to test the method (you can change this to test other cases)
        int[] test1 = { 1, 2, 3, 3 }; // Modify this array to include duplicates
        int[] test2 = { 1, 2, 3, 3 }; // Modify this array to include duplicates

        // Call hasDuplicateMethod and store the result
        boolean result1 = hasDuplicate.hasDuplicateMethod(test1);
        boolean result2 = hasDuplicate.hasDuplicateMethod(test2);

        // Print the result to the console
        System.out.println("Array has duplicates: " + result1);
        System.out.println("Array has duplicates: " + result2);
    }
}

// Time Complexity: O(n)
// - Each element is added to the HashSet and checked for existence in constant
// time,
// making the overall time complexity linear in relation to the number of
// elements in the array.

// Space Complexity: O(n)
// - The HashSet stores up to n elements, where n is the number of elements in
// the array,
// so the space complexity is linear in relation to the number of elements.
