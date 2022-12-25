import java.util.ArrayList;

public class subsequence {
    
    public static void sub(int []arr, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            if(list.size()>0){
            System.out.println(list);
            }
            if(list.size()==0){
                System.out.println("{}");
            }
            return;
        }
       
        sub(arr, index+1, list);
        list.add(arr[index]);
        sub(arr, index+1, list);
        list.remove(list.size()-1);
    }
    public static void main(String[] args) {
        int []arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        sub(arr, 0, list);
    }
}
