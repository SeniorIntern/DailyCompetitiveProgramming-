import java.util.Arrays;

/*
There is a programming language with only four operations and one variable X:
++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.
Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
*/
public class Running_Sum_1d_Array {
    public int finalValueAfterOperations(String[] operations) {
        int k = 0;
        for(int i=0; i<=operations.length;i++){
            System.out.println(operations[i]);
        }

        return k;
    }

    //    Driver Code
    public static void main(String[] args) {
        Running_Sum_1d_Array oj = new Running_Sum_1d_Array();
        System.out.println("output: " + oj.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
    }
}
