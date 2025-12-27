package Introduction;

import java.util.*;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("================================");
        do {
            sb.append(scanner.next());
            int number = scanner.nextInt();
            System.out.printf("%-15s%03d%n", sb, number);
            sb.delete(0, sb.length());

        } while (scanner.hasNext());
        System.out.println("================================");
    }
}
