package hackerrank;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pay = scanner.nextDouble();
        scanner.close();

        if (pay >= 0 && pay <= Math.pow(10, 9)) {
            BigDecimal payment = new BigDecimal(pay);
            payment.setScale(2, ROUND_HALF_UP);

            Locale lcIn = new Locale("en", "IN");
            NumberFormat nf = NumberFormat.getCurrencyInstance(lcIn);
            String india = nf.format(payment);
            String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
            String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }
}