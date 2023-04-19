package simple_tasks;

public class FibonacciSequence {

    public static void main(String[] args) {
//        findFibonacciSequence(10);

        for (int i = 0; i < 10; i++) {

        }
    }

    public static void findFibonacciSequence(int number) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(num1 + " ");

            int newNum = num1 + num2;
            num1 = num2;
            num2 = newNum;
        }
    }

    public static int findFibonacciSequenceRecursion(int number) {
        if (number <= 1) {
            return number;
        }
        return findFibonacciSequenceRecursion(number - 1) + findFibonacciSequenceRecursion(number - 2);
    }

    //TODO: add findFibonacciSequence with arrays
}
