/*
1470_Link: https://leetcode.com/problems/shuffle-the-array/
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/

import java.util.Arrays;

public class Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int p = 0;
        for (int i = 0; i < n; i++) {
            arr[p++] = nums[i];
            arr[p++] = nums[i + n];
        }
        return arr;
    }

    // Driver Code
    public static void main(String[] args) {
        Solution oj = new Solution();
        System.out.println("output: " + Arrays.toString(oj.shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4)));
    }
}
