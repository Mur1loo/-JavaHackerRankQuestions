package Introduction;

import java.util.Scanner;

import static java.lang.Math.pow;

public class JavaLoopsII {
    public static void main(String[] args) {
        int a, b, q, sum_serie = 0;
        double n;
        Scanner scanner = new Scanner(System.in);
        q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            for (double j = 0.0; j < n; j++) {
                if (j == 0.0) {
                    sum_serie = (int) (a + pow(2.0, 0.0) * b);
                }
                else {
                    sum_serie += (int) (pow(2.0, j)* b);

                }
                System.out.printf("%d ", sum_serie);
            }
            System.out.printf("%n");
        }
    }
}
