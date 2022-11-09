import java.util.Scanner;

public class EvenNumberDeterminant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int certainNumber = scanner.nextInt();

        if (certainNumber == 0) {
            System.out.println(certainNumber + " is 0");
        } else if (certainNumber % 2 == 0) {
            System.out.println(certainNumber + " is even number");
        } else {
            System.out.println(certainNumber + " is not even number");
        }
    }
}

