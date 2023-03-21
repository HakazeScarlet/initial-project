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

        manually(first, second, third);
        withLibrary(first, second, third);
    }

    private static void withLibrary(int first, int second, int third) {
        System.out.println(Math.max(first, Math.max(second, third)));
    }

    private static void manually(int first, int second, int third) {
        if (first > second && first > third) {
            print(first);
        } else if (second > first && second > third) {
            print(second);
        } else {
            print(third);
        }
        System.out.println();
    }

    private static void print(int number) {
        System.out.printf("%s", number + " is max");
    }
}
