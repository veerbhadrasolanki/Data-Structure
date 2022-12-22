package Recursion;

public class factorialOfN {
    
    public static int mul = 1;
    
    public static int fun(int n){
       if(n==1){
        return mul;
       }
       mul*=n;
       return fun(n-1);
    }
    
    public static void main(String args[]) {
        fun(5);
      System.out.println(mul);
    }
}