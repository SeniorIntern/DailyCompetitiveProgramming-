import java.util.Arrays;

// 905_Link: https://leetcode.com/problems/sort-array-by-parity/
/*
 * Given an integer array nums, move all the even integers at the beginning of the array followed by
 * all the odd integers. Return any array that satisfies this condition.
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int p = 0;
        int q = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                q = nums[p];
                nums[p] = nums[i];
                p++;
                nums[i] = q;
            }
        }
        return nums;
    }

    // Driver Code
    public static void main(String[] args) {
        SortArrayByParity oj = new SortArrayByParity();
        System.out.println(
                "output: " + Arrays.toString(oj.sortArrayByParity(new int[] {3, 1, 2, 4})));
    }
}
