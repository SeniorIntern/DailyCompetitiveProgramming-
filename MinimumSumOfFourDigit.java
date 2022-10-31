/*
2160. Minimum Sum of Four Digit Number After Splitting Digits
https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/submissions/
*/
import java.util.*;

public class MinimumSumOfFourDigit {
    public int minimumSum(int num){
        List<Integer> list = new ArrayList<> (4);
        for(int i =0; i<4; i++){
            list.add(num%10);
            num=num/10;
        }
        list.sort(null); 
        num = list.get(0)*10+list.get(2) + list.get(1)*10+list.get(3);
        return num;
    }

    public static void main(String[] args) {
        MinimumSumOfFourDigit o = new MinimumSumOfFourDigit();
        System.out.println("min: "+o.minimumSum(1234));
    }
}
