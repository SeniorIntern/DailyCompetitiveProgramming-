/*
Problem:
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
*/ 
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println("Ans is: "+Arrays.toString(getConcatenation(new int[]{1, 3, 2, 1})));
    }

    public static int[] getConcatenation(int[] nums) {
        System.out.println("Nums array: "+Arrays.toString(nums));
        int[] ans = new int[2*nums.length];
        for (int i=0; i<nums.length ;i++) {
            ans[i]=nums[i];
        }
        int p=2*nums.length;
        int q=nums.length;
        System.out.println("ans length: "+p);
        System.out.println("original length: "+nums.length);
        for (int i=nums.length; i<p ;i++) {
            ans[i]=nums[i-q];
        }
        return ans;
    }
}