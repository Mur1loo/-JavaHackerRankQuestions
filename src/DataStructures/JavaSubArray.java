package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JavaSubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] array = new int[n];

        String[] numbers = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] auxArray = Arrays.copyOfRange(array, i, j+1);
                int sumOfMenbers = 0;
                for (int member : auxArray) {
                    sumOfMenbers += member;
                }
                if (sumOfMenbers < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
