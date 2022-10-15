import java.util.ArrayList;
import java.util.List;

class HappyNumber{
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
        return helper(2,list);    
    }
}