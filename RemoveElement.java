// 27_Link: https://leetcode.com/problems/remove-element/
/*
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 * 
 * Since it is impossible to change the length of the array in some languages, you must instead have
 * the result be placed in the first part of the array nums. More formally, if there are k elements
 * after removing the duplicates, then the first k elements of nums should hold the final result. It
 * does not matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 */
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                count++;
                right--;
            } else
                left++;
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        RemoveElement oj = new RemoveElement();
        oj.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }
}
