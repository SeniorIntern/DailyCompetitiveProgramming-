// 1_Link: https://leetcode.com/problems/two-sum/
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target. You may assume that each input would have exactly one solution, and
 * you may not use the same element twice. You can return the answer in any order.
 */
import java.util.*;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[] {0, 1};

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;
	}

	// Driver Code
	public static void main(String[] args) {
		TwoSum oj = new TwoSum();
		System.out.println("output: " + Arrays.toString(oj.twoSum(new int[] {0, 4, 3, 0}, 0)));
	}
}
