public class Number_of_GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0; // initialzie count
        for(int i=0; i<nums.length; i++){
            // from beyond the index value of i to avoid repetition of elements
            for(int k=i+1; k<nums.length; k++){
                if(nums[i]==nums[k]){
                    count++;
                }
            }
        }
        return count;
    }

    //    Driver Code
    public static void main(String[] args) {
        Number_of_GoodPairs oj = new Number_of_GoodPairs();
        System.out.println("output: "+oj.numIdenticalPairs(new int[] {1,2,3,1,1,3}));
    }
}
