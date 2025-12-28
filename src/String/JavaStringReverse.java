package String;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder palindrome = new StringBuilder(sc.nextLine());
        System.out.println(palindrome.toString().contentEquals(palindrome.reverse()) ? "Yes" : "No");
    }
}
