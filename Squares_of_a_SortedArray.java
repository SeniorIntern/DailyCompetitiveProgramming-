/*
 * 977_Link: https://leetcode.com/problems/squares-of-a-sorted-array/ Given an integer array nums
 * sorted in non-decreasing order, return an array of the squares of each number sorted in
 * non-decreasing order.
 */
import java.util.*;

public class Squares_of_a_SortedArray {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List list = new ArrayList<Boolean>(candies.length);
        int max = candies[0];
        // find max element in the array
        for (int j : candies) {
            if (j > max) {
                max = j;
            }
        }

        for (int k : candies) {
            if (max <= k + extraCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    // Driver Code
    public static void main(String[] args) {
        Squares_of_a_SortedArray oj = new Squares_of_a_SortedArray();
        System.out.println("output: " + oj.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));
    }

}
