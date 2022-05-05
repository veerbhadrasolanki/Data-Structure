import java.io.CharArrayWriter;
import java.util.Scanner;

public class countAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CharArrayWriter res;
        int j;

        if (n == 1) {
            System.out.println("1");
        }

        if (n == 2) {
            System.out.println("11");
        }

        String finals = "11";
        for (int i = 3; i <= finals.length(); i++) {
            j = 0;
            res = new CharArrayWriter();
            while (j < finals.length()) {
                char num = finals.charAt(j);
                int count = 0;
                while (j < finals.length() && num == finals.charAt(j)) {
                    count++;
                    j++;
                }
                res.append(count).append(num);
            }
            finals = res.toString();
        }
        return finals;
    }
}
