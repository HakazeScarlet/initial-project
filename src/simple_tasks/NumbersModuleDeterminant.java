package simple_tasks;

import java.util.Scanner;

public class NumbersModuleDeterminant {

    int anyNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Add determined number: ");
        int anyNumber = scanner.nextInt();

        if(anyNumber > 0) {
            System.out.println(anyNumber + " is positive number");
        } else if (anyNumber == 0) {
            System.out.println(anyNumber + " is 0!");
        } else if (anyNumber <0) {
            System.out.println(anyNumber + " is negative number");
        }
    }
}
