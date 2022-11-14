// 169_Link: https://leetcode.com/problems/majority-element/
/*
 * Given an array nums of size n, return the majority element. The majority element is the element
 * that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in
 * the array.
 */

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int count = 0;
        int p = nums.length / 2;
        for (int i : nums) {
            count = 0;
            for (int j : nums) {
                if (i == j) {
                    count++;
                    if (count > p) {
                        return i;
                    }
                }
            }
        }
        return p;
    }

    // Driver Code
    public static void main(String[] args) {
        Solution oj = new Solution();
        System.out.println("output: " + oj.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
    }
}
