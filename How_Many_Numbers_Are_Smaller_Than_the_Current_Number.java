// 1365_Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
/*
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than
 * it. That is, for each nums[i] you have to count the number of valid j's such that j != i and
 * nums[j] < nums[i]. Return the answer in an array.
 */

import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // {8, 1, 2, 2, 3}
        int[] arr = new int[nums.length];
        int k, j, i;
        for (i = 0; i < nums.length; i++) {
            k = 0;
            for (j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    k++;
                }
            }
            arr[i] = k;
        }
        return arr;
    }


    // Driver Code
    public static void main(String[] args) {
        How_Many_Numbers_Are_Smaller_Than_the_Current_Number oj =
                new How_Many_Numbers_Are_Smaller_Than_the_Current_Number();
        System.out.println(
                "output: " + Arrays.toString(oj.smallerNumbersThanCurrent(new int[] {6, 5, 4, 8})));
    }
}
