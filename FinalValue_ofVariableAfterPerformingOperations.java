/*
2011_Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
There is a programming language with only four operations and one variable X:
++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.
Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
*/
public class FinalValue_ofVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String i : operations) {
            if (i.equals("--X") || i.equals("X--")) {
                X = X - 1;
            } else {
                X = X + 1;
            }
        }
        return X;
    }

    //    Driver Code;
    public static void main(String[] args) {
        FinalValue_ofVariableAfterPerformingOperations oj = new FinalValue_ofVariableAfterPerformingOperations();
        System.out.println(oj.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }
}
