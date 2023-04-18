package simple_tasks;

import java.util.Scanner;

public class LeapYearDeterminant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s", "Add determined year: ");

        int yearNumber = scanner.nextInt();
        if (yearNumber % 100 == 0 && yearNumber % 400 == 0) {
            System.out.println(yearNumber + " is leap year");
        } else if (yearNumber % 4 == 0 && yearNumber % 100 != 0) {
            System.out.println(yearNumber + " is leap year");
        } else {
            System.out.println(yearNumber + " don`t leap year");
        }
    }
}
