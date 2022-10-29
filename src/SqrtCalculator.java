import java.util.Scanner;

public class SqrtCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real number: ");

        String strDoubleNumber = scanner.nextLine(); // read string from terminal
        double number = Double.parseDouble(strDoubleNumber); // convert string to double number

        double sqrt = Math.sqrt(number);

        System.out.println("Result: " + sqrt);
    }
}
