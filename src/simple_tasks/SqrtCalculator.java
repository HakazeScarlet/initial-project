package simple_tasks;

import java.util.Scanner;

public class SqrtCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real number: ");

        String strDoubleNumber = scanner.nextLine();
        double number = Double.parseDouble(strDoubleNumber);

        double sqrt = Math.sqrt(number);

        System.out.println("Result: " + sqrt);
    }
}
