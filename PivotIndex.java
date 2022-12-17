class PivotIndex {
    public int pivotIndex(int[] nums) {
        // space: O(1) time: O(n)
        int index = 0;
        int leftSum = 0;
        int sum = 0;

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


