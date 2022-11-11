// 2176_Link: https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
/*
 * Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i,
 * j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
 */
public class Count_Equal_and_Divisible_Pairs_in_an_Array {
	public int countPairs(int[] nums, int k) {
		int pairs = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					if ((i * j) % k == 0) {
						pairs += 1;
					}
				}
			}
		}
		return pairs;
	}

	// Driver Code
	public static void main(String[] args) {
		Count_Equal_and_Divisible_Pairs_in_an_Array oj =
				new Count_Equal_and_Divisible_Pairs_in_an_Array();
		System.out.println("output: " + oj.countPairs(new int[] {3, 1, 2, 2, 2, 1, 3}, 2));
	}
}
