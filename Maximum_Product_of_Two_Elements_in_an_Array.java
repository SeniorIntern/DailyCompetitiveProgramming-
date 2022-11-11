// 1464_Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
/*
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */
import java.util.Arrays;

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int p = ((nums[nums.length - 1]) - 1) * ((nums[nums.length - 2]) - 1);
        return p;
    }

    // Driver Code
    public static void main(String[] args) {
        Maximum_Product_of_Two_Elements_in_an_Array oj =
                new Maximum_Product_of_Two_Elements_in_an_Array();
        System.out.println("output: " + oj.maxProduct(new int[] {3, 4, 5, 2}));
    }
}
