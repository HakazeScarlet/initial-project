package hackerrank;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();

        int sLength = s.length();
        String min = s.substring(0, k);
        String max = s.substring(0, k);
        for (int i = 0; i < sLength - 2; i++) {
            if (s.substring(i, i + k).compareTo(min) < 0) {
                min = s.substring(i, i + k);
            } else if (s.substring(i, i + k).compareTo(max) > 0) {
                max = s.substring(i, i + k);
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
