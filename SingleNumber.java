// 136_Link: https://leetcode.com/problems/single-number/
/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that
 * single one. You must implement a solution with a linear runtime complexity and use only constant
 * extra space.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1 || nums[0] != nums[1]) {
            return nums[0];
        }

        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        else {
            for (int i = 2; i < nums.length - 1; i += 2) {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
        }

        return 0;
    }

    // Driver Code
    public static void main(String[] args) {
        Solution oj = new Solution();
        System.out.println("output: " + oj.singleNumber(new int[] {4, 1, 2, 1, 2}));
    }
}
