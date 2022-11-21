// 1732_Link: https://leetcode.com/problems/count-items-matching-a-rule/
/*
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different
 * altitudes. The biker starts his trip on point 0 with altitude equal 0. You are given an integer
 * array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1
 * for all (0 <= i < n). Return the highest altitude of a point.
 */
public class Solution {
    public int largestAltitude(int[] gain) {
        int ha = 0;
        int sum = 0;
        for (int i : gain) {
            sum += i;
            if (ha < sum) {
                ha = sum;
            }
        }
        return ha;
    }

    // Driver Code
    public static void main(String[] args) {
        Solution oj = new Solution();
        System.out.println("output:" + oj.largestAltitude(new int[] {-4, -3, -2, -1, 4, 3, 2}));
    }
}
