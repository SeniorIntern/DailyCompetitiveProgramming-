/*
1945_Link: https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
You are given a string s consisting of lowercase English letters, and an integer k.
First, convert s into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.

Constraints:
    s consists of lowercase English letters.
    1 <= s.length <= 100
    1 <= k <= 10
*/
class SumOfDigitsOfStringAfterConvert {
	public static void main(String[] args) {
        SumOfDigitsOfStringAfterConvert oj = new SumOfDigitsOfStringAfterConvert();
        System.out.println("Resulting integer: "+oj.getLucky("iiii", 2));
	}
	
    public int getLucky(String s, int k) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            int initial=((int)(s.charAt(i) - 96));
            if(initial>=10){
                val+=initial/10 + initial%10;
            }else{
                val+=initial;
            }
        }   
        k--;
        int ans=val;
        while(k>0){
            ans=0;
            while(val>0){
                int num=val%10;
                ans+=num;
                val/=10;
            }
            val=ans;
            k--;
        }
        return ans;
    }
}