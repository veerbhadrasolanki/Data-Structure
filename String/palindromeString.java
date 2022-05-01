import java.util.Scanner;

class palindromeString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char str[] = s.toCharArray();
        int len = str.length - 1;
        int start = 0;
        boolean flag = true;
        while (start < len) {
            if (str[start] != str[len]) {
                flag = false;
                break;
            }
            start++;
            len--;
        }
        if (flag == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}