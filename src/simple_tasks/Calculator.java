package simple_tasks;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(5, 4));
        System.out.println(subtract(6, 7));
        System.out.println(multiply(6, 3));
        System.out.println(divide(6, 2));
        }

    public static double add(double first, double second) {
        return first + second;
    }

    public static double subtract(double first, double second) {
        return first - second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double divide(double first, double second) {
        return first / second;
    }
}
