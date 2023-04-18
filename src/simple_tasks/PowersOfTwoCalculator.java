package simple_tasks;

public class PowersOfTwoCalculator {

    public static void main(String[] args) {
        print(pow(5));
    }

    private static double[] pow(int number) {
        double[] powersOf2 = new double[number + 1];
        for (int i = 0; i <= number; i++) {
            double power = Math.pow(2, i);
            powersOf2[i] = power;
        }
        return powersOf2;
    }

    private static void print(double[] powers) {
        for (double power : powers) {
            System.out.println(power);
        }
    }
}
