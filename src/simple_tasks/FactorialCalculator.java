package simple_tasks;

public class FactorialCalculator {

    public static void main(String[] args) {
        System.out.println(findFactorial(4));
        System.out.println(findFactorial(3));
    }

    private static int findFactorial(int number) {
        if (number == 1) {
            return 0;
        }

        int amount = 1;
        for (int i = 1; i <= number; i++) {
            amount = amount * i;
        }
        return amount;
    }
}
