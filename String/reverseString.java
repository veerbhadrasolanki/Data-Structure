package String;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char str[] = s.toCharArray();
        int len = str.length - 1;
        int start = 0;
        while (start < len) {
            char temp;
            temp = str[start];
            str[start] = str[len];
            str[len] = temp;
            start++;
            len--;
        }
        String snew = String.copyValueOf(str);
        System.out.print(snew);
    }
}
