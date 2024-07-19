package neetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // Method with default implementation
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numArr = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            if (numArr.containsKey(remaining)) {
                return new int[] { numArr.get(remaining), i };
            }

            numArr.put(nums[i], i);
        }

        return new int[] {};
    }

    // Main method to test myMethod
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum(); // Create an instance of MyClass

        int[] test1 = new int[] { 3, 4, 5, 6 };
        int target1 = 7;

        int[] test2 = new int[] { 4, 5, 6 };
        int target2 = 10;

        int[] result2 = twoSum.twoSum(test2, target2);
        int[] result1 = twoSum.twoSum(test1, target1);

        System.out.println("Result for test1: " + Arrays.toString(result1));
        System.out.println("Result for test2: " + Arrays.toString(result2));

    }
}