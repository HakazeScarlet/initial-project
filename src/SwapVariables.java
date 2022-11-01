import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter variable 1: ");
        int variable1 = scanner.nextInt();
        System.out.println("Enter variable 2: ");
        int variable2 = scanner.nextInt();

        variable1 = variable2 + variable1;
        variable2 = variable1 - variable2;
        variable1 = variable1 - variable2;
        System.out.println("New variable 1 is: " + variable1);
        System.out.println("New variable 2 is: " + variable2);
    }
}
