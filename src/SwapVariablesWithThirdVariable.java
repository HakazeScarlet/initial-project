import java.util.Scanner;

public class SwapVariablesWithThirdVariable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter variable A: ");
        int variableA = scanner.nextInt();
        System.out.println("Enter variable B: ");
        int variableB = scanner.nextInt();

        int variableC = variableA;
        variableA = variableB;
        variableB = variableC;

        System.out.println("New variable A is: " + variableA);
        System.out.println("New variable B is: " + variableB);
    }
}
