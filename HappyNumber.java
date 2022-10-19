/*
PROBLEM:
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
*/ 

import java.util.ArrayList;
import java.util.List;

class HappyNumber{
    // O(1) space Complexity
    public static void main(String[] args) {
        System.out.println();  
    }
    public boolean helper(int n,List<Integer> list){
        //base condition
        if(n==1)return true;
        int sum=0;
        while(n>0){
            int ans=n%10; 
            sum+=ans*ans;
            n/=10;
        }
        if(list.contains(sum))return false;
        list.add(sum);
        return sum>0 ?helper(sum,list):false;
    }

    public boolean isHappy(int n){
        List <Integer> list=new ArrayList<>();
        return helper(2,list);   // provide the number here 
    }
}