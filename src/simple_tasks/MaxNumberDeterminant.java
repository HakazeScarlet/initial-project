package simple_tasks;

import java.util.Scanner;

public class MaxNumberDeterminant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s", "Add first number: ");
        int first = scanner.nextInt();
        System.out.printf("%s", "Add second number: ");
        int second = scanner.nextInt();
        System.out.printf("%s", "Add third number: ");
        int third = scanner.nextInt();

        print(manually(first, second, third));

        print(withLibrary(first, second, third));
    }

    private static int withLibrary(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }

    private static int manually(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }

    private static void print(int number) {
        System.out.printf("%s", number + " is max");
    }
}
