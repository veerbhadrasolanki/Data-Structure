import java.util.*;
import java.lang.*;

public class reverseOfArray {
    
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void fun(int i, int []a, int n){
        if(i>=n/2){
         return ;
        }
        Swap(a[i],a[n-i-1]);
        fun(i+1,a,n);
     }
     
     public static void main(String args[]) {
        int []a={1,2,3,4};
        int n =a.length;
        fun(0,a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
     }
}
