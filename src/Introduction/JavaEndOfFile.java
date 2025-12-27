package Introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        int i = 0;
        while (scanner.hasNext()) {
            string.append(scanner.nextLine());
            i++; System.out.printf("%d %s%n", i, string);
            string.delete(0, string.length());
        }
    }
}
