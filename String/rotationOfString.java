import java.util.Scanner;

public class rotationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        String S3 = S1 + S1;
        System.out.println(S3.contains(S2));
    }
}
