package Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat chFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);

        double payment = sc.nextDouble();

        String us = usFormat.format(payment);
        String fr = frFormat.format(payment);
        String ch = chFormat.format(payment);
        String india = indiaFormat.format(payment);

        System.out.printf("US: %s%nIndia: %s%nChina: %s%nFrance: %s%n", us, india, ch, fr);
    }
}
