package simple_tasks;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature of Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Temperature of Fahrenheit is " + ((celsius * 9 / 5) + 32));
    }
}
