// 1295_Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
/*
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class FindNumbers_withEvenNumber_ofDigits {
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
}
