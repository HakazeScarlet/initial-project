import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature of Celsius: ");
        double celsius = scanner.nextDouble();

        // real numbers - 9.0, 5.0, 4.2
        // integer - 9, 5, 4, 2
        System.out.println("Temperature of Fahrenheit is " + ((celsius * 9.0 / 5.0) + 32.0));
        System.out.println("Temperature of Fahrenheit is " + ((celsius * (9.0 / 5.0) + 32.0)));
        System.out.println("Temperature of Fahrenheit is " + ((9.0 / 5.0) * celsius + 32.0));
    }
}
