import java.util.Arrays;
import java.util.Scanner;

public class leftMostRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = Integer.MAX_VALUE;
        int count[] = new int[256];
        Arrays.fill(count, -1);

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == -1) {
                count[str.charAt(i)] = i;
            } else {
                res = Math.min(res, count[str.charAt(i)]);
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(str.charAt(res));
        }
        ;
    }
}
