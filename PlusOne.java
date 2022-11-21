// 66_Link: https://leetcode.com/problems/plus-one/
/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the
 * ith digit of the integer. The digits are ordered from most significant to least significant in
 * left-to-right order. The large integer does not contain any leading 0's. Increment the large
 * integer by one and return the resulting array of digits.
 */
import java.util.*;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        index = digits.length - 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else
                digits[i] = 0;
        }
        int arr[] = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }

    // Driver Code
    public static void main(String[] args) {
        PlusOne oj = new PlusOne();
        System.out.println("output:" + Arrays.toString(oj.plusOne(new int[] {1, 9, 3, 9})));
    }
}
