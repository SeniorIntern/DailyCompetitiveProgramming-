// 1389_Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
/*
 * Given two arrays of integers nums and index. Your task is to create target array under the
 * following rules:
 * 
 * Initially target array is empty. From left to right read nums[i] and index[i], insert at index
 * index[i] the value nums[i] in target array. Repeat the previous step until there are no elements
 * to read in nums and index. Return the target array.
 * 
 * It is guaranteed that the insertion operations will be valid.
 */
import java.util.Arrays;

public class CreateTargetArray_in_theGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        // O(n*n) O(1)
        for (int i = 0; i < index.length; i++) {
            int temp = nums[i];
            for (int j = i; j > index[i]; j--) {
                if (j > 0)
                    nums[j] = nums[j - 1];
            }
            nums[index[i]] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        CreateTargetArray_in_theGivenOrder oj = new CreateTargetArray_in_theGivenOrder();
        System.out.println("output: " + Arrays.toString(
                oj.createTargetArray(new int[] {1, 2, 3, 4, 0}, new int[] {0, 1, 2, 3, 0})));
    }

}
