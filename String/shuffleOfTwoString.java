import java.util.Arrays;
import java.util.Scanner;

public class shuffleOfTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        String Check = sc.nextLine();
        String temp = S1 + S2;
        /*
         * char[] dump1 = temp.toCharArray();
         * char[] dump2 = Check.toCharArray();
         * Arrays.sort(dump1);
         * Arrays.sort(dump2);
         */
        if (temp.length() == Check.length()) {
            System.out.println(temp.contains(Check));
        } else {
            System.out.println("Not Shuffled");
        }
    }
}
