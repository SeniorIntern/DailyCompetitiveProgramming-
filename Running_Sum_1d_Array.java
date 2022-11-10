
/*
1480_Link: https://leetcode.com/problems/running-sum-of-1d-array/
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
*/
import java.util.Arrays;

public class Running_Sum_1d_Array {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + sum;
            sum = nums[i];
        }
        return nums;
    }

    // Driver Code
    public static void main(String[] args) {
        Running_Sum_1d_Array oj = new Running_Sum_1d_Array();
        System.out.println("output: " + Arrays.toString(oj.runningSum(new int[] { 1, 2, 3, 4 })));
    }
}
