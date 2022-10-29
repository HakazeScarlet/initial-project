import java.util.Scanner;

public class SqrtCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real number: ");
        double number = scanner.nextDouble();

        double sqrt = Math.sqrt(number);

        System.out.println("Result: " + sqrt);
    }
}
