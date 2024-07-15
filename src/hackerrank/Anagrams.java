package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        scanner.close();

        String lowWord1 = word1.toLowerCase();
        String lowWord2 = word2.toLowerCase();

        char[] lowCharArr1 = lowWord1.toCharArray();
        char[] lowCharArr2 = lowWord2.toCharArray();

        Arrays.sort(lowCharArr1);
        Arrays.sort(lowCharArr2);

        if (Arrays.equals(lowCharArr1, lowCharArr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
