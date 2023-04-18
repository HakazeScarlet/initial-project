package simple_tasks;

public class SumCalculator {

    public static void main(String[] args) {
        System.out.println(findSumRecursion(4));
    }

    private static int findSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static int findSumRecursion(int num) {
        if (num == 1) {
            return num;
        } else {
            return num + findSumRecursion(num - 1);
        }
    }
}
