/*
PROBLEM:
Given an integer "num", repeatedly add all its digits until the result has only one digit, and return it.
*/ 
public class AddDigits {
    public static void main(String[] args) {
        System.out.println("The single digit is: "+addDigits(223)); // provide integer number here
    }

    public static int addDigits(int num) {
        int sum=0;
        int digit;
        boolean doLoop = true;
        while(doLoop){
            digit = num%10;
            sum += digit;
            num /= 10;

            if(num<10){
                doLoop = false;
                sum += num;
                if(sum>9){
                    int x=sum;
                    num = x;
                    doLoop = true;
                    digit=0;
                    sum=0;
                }
            }
        }
        return sum;
    }
}
