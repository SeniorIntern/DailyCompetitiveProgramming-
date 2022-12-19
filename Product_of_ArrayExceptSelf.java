class Product_of_ArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int totalZero = 0;
        int prod = 1;

        for (int i : nums) {
            if (i == 0) {
                totalZero++;
                continue;
            }
            prod *= i;
        }

        if (totalZero == 0) {
            for (int j = 0; j < nums.length; j++) {
                nums[j] = prod / nums[j];
            }
            return nums;
        }

        if (totalZero == 1) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 0) {
                    nums[j] = prod;
                    continue;
                }
                nums[j] = 0;
            }
            return nums;
        }

        if (totalZero > 1) {
            for (int j = 0; j < nums.length; j++) {
                nums[j] = 0;
            }
            return nums;
        }
        return nums;
    }
}
