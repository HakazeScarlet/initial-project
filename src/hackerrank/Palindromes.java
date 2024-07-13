package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();
        int wordLength = word.length();

        char[] charArr = new char[wordLength];
        if (wordLength <= 50) {
            for (int i = 0; i <= wordLength - 1; i++) {
                charArr[i] = word.charAt(i);
            }
        }

        char[] charArrUn = new char[wordLength];
        int k = 0;
        for (int j = wordLength - 1; j >=0 ; j--) {
            charArrUn[k] = word.charAt(j);
            k++;
        }

        if (Arrays.equals(charArr, charArrUn) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
