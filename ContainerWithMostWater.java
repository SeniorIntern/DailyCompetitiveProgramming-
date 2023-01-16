class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int temp = 0; // handle index gap, temporary max
        int max = 0;

        while (i < j) {
            if (height[i] < height[j]) {
                temp = height[i] * (j - i);
                i++;
            } else {
                temp = height[j] * (j - i);
                j--;
            }
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String args[]) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        obj.maxArea(new int[] { 2, 3, 4, 5, 18, 17, 6 });
    }
}