// 268_Link: https://leetcode.com/problems/missing-number/
/*
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in
 * the range that is missing from the array.
 */
class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }

    // Driver Code
    public static void main(String[] args) {
        MissingNumber oj = new MissingNumber();
        System.out.println("missing number: " + oj.missingNumber(new int[] {0, 1, 3}));
    }
}
