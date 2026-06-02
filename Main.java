import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number");
        int a = sc.nextInt();
        int b = a;
        int rev = 0;
        while (a != 0) {
            rev = (rev * 10) + a % 10;
            a = a / 10;
        }
        if (rev == b) {
            System.out.print("Palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
