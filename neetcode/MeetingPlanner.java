import java.util.Arrays;

public class MeetingPlanner {

    // Method to find a meeting slot of a given duration
    public int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
        int i = 0;
        int j = 0;

        // Iterate through both time slots arrays
        while (i < slotsA.length && j < slotsB.length) {
            // Find the maximum of the start times and the minimum of the end times
            int startTime = Math.max(slotsA[i][0], slotsB[j][0]);
            int endTime = Math.min(slotsA[i][1], slotsB[j][1]);

            // Check if the time difference is greater than or equal to the desired duration
            if (endTime - startTime >= dur) {
                return new int[] { startTime, startTime + dur };
            }

            // Move the pointer that has the earlier end time
            if (slotsA[i][1] < slotsB[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        // Return an empty array if no suitable time slot is found
        return new int[] {};
    }

    // Main method to test the meetingPlanner method
    public static void main(String[] args) {
        MeetingPlanner meetingPlanner = new MeetingPlanner(); // Create an instance of MeetingPlanner

        // Test case 1
        int[][] slotsA1 = { { 10, 50 }, { 60, 120 }, { 140, 210 } };
        int[][] slotsB1 = { { 0, 15 }, { 60, 70 } };
        int dur1 = 8;
        int[] result1 = meetingPlanner.meetingPlanner(slotsA1, slotsB1, dur1);
        System.out.println("Result for test case 1: " + Arrays.toString(result1));

        // Test case 2
        int[][] slotsA2 = { { 7, 12 } };
        int[][] slotsB2 = { { 2, 11 } };
        int dur2 = 5;
        int[] result2 = meetingPlanner.meetingPlanner(slotsA2, slotsB2, dur2);
        System.out.println("Result for test case 2: " + Arrays.toString(result2));
    }
}

// Time Complexity: O(n + m)
// - The method iterates through both time slots arrays. In the worst case, it will iterate through all elements in both arrays.

// Space Complexity: O(1)
// - The space complexity is constant because no additional space is used that grows with the input size.
