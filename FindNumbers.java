// 1295_Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
/*
Given an array nums of integers, return how many of them contain an even number of digits.
*/
public class FindNumbers {
    public int findNumbers(int[] nums) {
        int count = 0;
        int p = 0;
        for (int i : nums) {
            while (i != 0) {
                i /= 10;
                p++;
            }
            System.out.println("num count: " + p);
            if (p % 2 == 0) {
                count += 1;
            }
            p = 0;
        }
        return count;
    }

    // Driver Code
    public static void main(String[] args) {
        FindNumbers oj = new FindNumbers();
        System.out.println("output:" + oj.findNumbers(new int[] {12, 345, 2, 6, 7896}));
    }
}
