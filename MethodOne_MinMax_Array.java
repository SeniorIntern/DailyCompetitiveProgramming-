/*
Learning - Maximum and minimum of an array using minimum number of comparisons
GfG_Link: https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
*/
// Method 1/3: Linear Search
public class MethodOne_MinMax_Array {
    // use structure (pair class) to return multiple values
    static class Pair { int min, max; }

    static Pair getMinMax(int[] arr, int n) {
        Pair minmax = new Pair();

        // when array has single element
        if (n == 1) {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }

        // If array has more than 1 element, initialize min and max
        if (arr[0] > arr[1]) {
            minmax.min = arr[1];
            minmax.max = arr[0];
        } else {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        // Compare with remaining elements, and change max and min accordingly
        for (int i = 2; i < n; i++) {
            if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
            if (arr[i] > minmax.min) {
                minmax.max = arr[i];
            }
        }
        return minmax;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int n = arr.length;
        Pair minmax = getMinMax(arr, n);
        System.out.println("min: " + minmax.min);
        System.out.println("max: " + minmax.max);
    }
}
