import java.util.Arrays;

// 88_Link: https://leetcode.com/problems/merge-sorted-array/
/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two
 * integers m and n, representing the number of elements in nums1 and nums2 respectively. Merge
 * nums1 and nums2 into a single array sorted in non-decreasing order. The final sorted array should
 * not be returned by the function, but instead be stored inside the array nums1. To accommodate
 * this, nums1 has a length of m + n, where the first m elements denote the elements that should be
 * merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {
    // time: nlog(n). space: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = n;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[n - p];
            p--;
        }
        Arrays.sort(nums1); //
    }

    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3);
    }
}

