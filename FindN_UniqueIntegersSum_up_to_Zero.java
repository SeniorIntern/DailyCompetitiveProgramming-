// 1304_Link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
/*
 * Given an integer n, return any array containing n unique integers such that they add up to 0
 */

class FindN_UniqueIntegersSum_up_to_Zero {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int j = 0;
        for (int i = 1; i <= arr.length / 2; i++) {
            arr[j] = i;
            arr[j + 1] = -i;
            j += 2;
        }

        if (n % 2 != 0) {
            arr[n - 1] = 0;
        }
        return arr;
    }
}
