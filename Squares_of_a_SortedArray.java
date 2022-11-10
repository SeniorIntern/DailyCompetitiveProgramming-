/*
 * 977_Link: https://leetcode.com/problems/squares-of-a-sorted-array/ Given an integer array nums
 * sorted in non-decreasing order, return an array of the squares of each number sorted in
 * non-decreasing order.
 */
import java.util.Arrays;

public class Squares_of_a_SortedArray {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    // Driver Code
    public static void main(String[] args) {
        Squares_of_a_SortedArray oj = new Squares_of_a_SortedArray();
        System.out.println(
                "output: " + Arrays.toString(oj.sortedSquares(new int[] {-4, -1, 0, 3, 10})));
    }

}
