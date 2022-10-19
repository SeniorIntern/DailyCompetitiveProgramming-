import java.util.*;

/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
*/ 
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        System.out.println("Ans is: "+Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
    }

    public static int[] buildArray(int[] nums) {
        System.out.println("Nums array: "+Arrays.toString(nums));
        int[] ans = new int[nums.length];   //build array with equal length
        // loop ans.length=6 times.
        for (int i : nums) {
            int x=0;
            x = nums[nums[i]];
            ans[i]=x;
        }
        return ans;
    }
}
