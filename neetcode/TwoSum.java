package neetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // Method to find two indices such that their values add up to the target
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the value and its index
        HashMap<Integer, Integer> numArr = new HashMap<>();

        // Iterate through the array to find the two indices
        for (int i = 0; i < nums.length; i++) {
            // Calculate the remaining value needed to reach the target
            int remaining = target - nums[i];

            // Check if the remaining value exists in the map
            if (numArr.containsKey(remaining)) {
                // Return the indices of the current value and the remaining value
                return new int[] { numArr.get(remaining), i };
            }

            // Add the current value and its index to the map
            numArr.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[] {};
    }

    // Main method to test twoSum
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum(); // Create an instance of TwoSum

        // Sample arrays and targets for testing
        int[] test1 = new int[] { 3, 4, 5, 6 };
        int target1 = 7;

        int[] test2 = new int[] { 4, 5, 6 };
        int target2 = 10;

        // Call the twoSum method with the sample arrays and targets
        int[] result1 = twoSum.twoSum(test1, target1);
        int[] result2 = twoSum.twoSum(test2, target2);

        // Print the results using Arrays.toString to format the arrays
        System.out.println("Result for test1: " + Arrays.toString(result1));
        System.out.println("Result for test2: " + Arrays.toString(result2));
    }
}

// Time Complexity: O(n)
// - The method iterates through the array once, and each lookup or insertion in the HashMap is O(1) on average.

// Space Complexity: O(n)
// - The space complexity is O(n) due to the HashMap storing up to n elements, where n is the length of the input array.
