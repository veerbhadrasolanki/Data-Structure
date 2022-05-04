import java.util.Arrays;
import java.util.Scanner;

public class shuffleOfTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        String Check = sc.nextLine();
        String temp = S1 + S2;

        char[] dump1 = temp.toCharArray();
        char[] dump2 = Check.toCharArray();
        Arrays.sort(dump1);
        Arrays.sort(dump2);
        boolean flag = true;
        if (dump1.length == dump2.length) {
            for (int i = 0; i < dump1.length; i++) {
                if (dump1[i] == dump2[i]) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }

        if (flag == true) {
            System.out.println("Shuffled");
        } else {
            System.out.println("Not Shuffled");
        }
    }
}
