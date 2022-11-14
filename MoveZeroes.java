// 283_Link: https://leetcode.com/problems/move-zeroes/
/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order
 * of the non-zero elements. Note that you must do this in-place without making a copy of the array.
 */

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }

            if (nums[i] != 0) {
                nums[i - count] = nums[i];
            }
        }
        while (count > 0) {
            nums[nums.length - count] = 0;
            count--;
        }
        System.out.println(Arrays.toString(nums));
    }

    // Driver code
    public static void main(String[] args) {
        MoveZeroes oj = new MoveZeroes();
        oj.moveZeroes(new int[] {0, 1, 0, 3, 12});
    }
}
