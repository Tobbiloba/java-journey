package neetcode;

import java.util.Arrays;
import java.util.HashMap;

public class MergingPackages {

    // Method to find two indices in the array such that their weights add up to the
    // limit
    public int[] getIndicesOfItemWeights(int[] arr, int limit) {
        // Create a map to store the weight and its index
        HashMap<Integer, Integer> seenNum = new HashMap<>();

        // Iterate through the array in reverse to find the two indices
        for (int i = arr.length - 1; i >= 0; i--) {
            // Calculate the remaining weight needed to reach the limit
            int remaining = limit - arr[i];

            // Check if the remaining weight exists in the map
            if (seenNum.containsKey(remaining)) {
                // Return the indices of the current weight and the remaining weight
                return new int[] { seenNum.get(remaining), i };
            }

            // Add the current weight and its index to the map
            seenNum.put(arr[i], i);
        }

        // Return an empty array if no solution is found
        return new int[] {};
    }

    // Main method to test getIndicesOfItemWeights
    public static void main(String[] args) {
        MergingPackages mergingPackages = new MergingPackages(); // Create an instance of MergingPackages

        // Sample arrays and limits for testing
        int[] test1 = new int[] { 4, 4 };
        int lim1 = 8;

        int[] test2 = new int[] { 4, 4, 1 };
        int lim2 = 5;

        // Call the getIndicesOfItemWeights method with the sample arrays and limits
        int[] result1 = mergingPackages.getIndicesOfItemWeights(test1, lim1);
        int[] result2 = mergingPackages.getIndicesOfItemWeights(test2, lim2);

        // Print the results using Arrays.toString to format the arrays
        System.out.println("Result for test1: " + Arrays.toString(result1));
        System.out.println("Result for test2: " + Arrays.toString(result2));
    }
}

// Time Complexity: O(n)
// - The method iterates through the array once, with each lookup and insertion
// in the HashMap being O(1) on average.

// Space Complexity: O(n)
// - The space complexity is O(n) due to the HashMap storing up to n elements,
// where n is the length of the input array.
