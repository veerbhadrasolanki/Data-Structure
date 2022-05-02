import java.util.Scanner;

public class duplicateCharString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int j = 0; j < 256; j++) {
            if (count[j] > 1) {
                System.out.println((char) j);
            }
        }
    }
}
