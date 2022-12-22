public class sumOfN {
    
    public static int sum = 0;
    
    public static int fun(int n){
        if(n<1){
            return sum;
        }
        sum+=n;
        return fun(n-1);
    }
    
    public static void main(String args[]) {
        fun(5);
      System.out.println(sum);
    }
}