package hackerrank;

import java.util.Scanner;

public class HackerrankEOF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = new String();
        int i = 1;

        while (scanner.hasNext()) {
            myString = scanner.nextLine();
            System.out.println(i + " " + myString);
            i++;
        }
        scanner.close();
    }
}
