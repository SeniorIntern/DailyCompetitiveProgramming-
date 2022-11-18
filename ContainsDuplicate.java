// 217_Link: https://leetcode.com/problems/contains-duplicate/submissions/
/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and
 * return false if every element is distinct.
 */
import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == (nums.length - 1)) {
                return false;
            }
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // Driver Code
    public static void main(String[] args) {
        Solution oj = new Solution();
        System.out.println("output:" + oj.containsDuplicate(new int[] {3, 3}));
    }
}
