class Find_the_MiddleIndex_in_Array {
    // time: O(n). space: O(1)
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int index = 0;
        int leftSum = 0;

        for (int p : nums) {
            sum += p;
        }

        for (int q : nums) {
            sum -= q;
            if (leftSum == sum)
                return index;
            index++;
            leftSum += q;
        }
        return -1;
    }
}
