import java.util.Arrays;
import java.util.Scanner;

public class duplicateCharString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // char s[] = str.toCharArray();
        int[] count = new int[256];
        Arrays.fill(count, 0);
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int j = 1; j <= 256; j++) {
            if (count[str.charAt(j)] >= 2) {
                System.out.println(str.charAt(j));
            }
        }
    }
}
