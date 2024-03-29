package simple_tasks;

public class FactorialCalculator {

    public static void main(String[] args) {
        System.out.println(findFactorial(4));
        System.out.println(findFactorial(3));
        System.out.println(findFactorialRecursion(5));
    }

    private static int findFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        int amount = 1;
        for (int i = 1; i <= number; i++) {
            amount = amount * i;
        }

        return number;
    }

    private static int findFactorialRecursion(int number) {
        if (number == 0) {
            return 1;
        }

        return number * findFactorialRecursion(number - 1);
    }
}
