package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java1DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(buffer.readLine());

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(buffer.readLine());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
