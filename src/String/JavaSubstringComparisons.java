package String;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparisons {

	private static String[] calculateLex(String text, int lenght) {
		String[] substrings = new String[text.length() - lenght + 1];

		for (int i = 0; i < text.length() - lenght + 1; i++) {
			substrings[i] = text.substring(i, i + lenght);
		}
		return substrings;
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		int k = scanner.nextInt();

		String[] lexSubstrings = calculateLex(s, k);
		Arrays.sort(lexSubstrings);
		System.out.printf("%s%n%s", lexSubstrings[0], lexSubstrings[lexSubstrings.length-1]);
	}
}
