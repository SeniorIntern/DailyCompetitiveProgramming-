// 349_Link: https://leetcode.com/problems/intersection-of-two-arrays/
/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in
 * the result must be unique and you may return the result in any order.
 */
import java.util.List;
import java.util.ArrayList;

class Intersection_ofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : nums1) {
            list1.add(i);
        }
        for (int j : nums2) {
            if (list1.contains(j)) {
                if (list2.contains(j))
                    continue;
                list2.add(j);
            }
        }

        int arr[] = new int[list2.size()];
        for (int p = 0; p < list2.size(); p++) {
            arr[p] = list2.get(p);
        }
        return arr;
    }
}
