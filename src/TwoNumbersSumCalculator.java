import java.util.Scanner;

public class TwoNumbersSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("enter second number: ");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;

        System.out.println("result is: " + sum);
    }
}
