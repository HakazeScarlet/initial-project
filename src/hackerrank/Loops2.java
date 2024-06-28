package hackerrank;

import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        if (q >= 0 && q <= 500) {
            int[][] myQArr = new int[3][q];

            int a, b, n;
            for (int i = 0; i < q; i++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                n = scanner.nextInt();

                if (a >= 0 && a <= 50) {
                    myQArr[0][i] = a;
                }
                if (b >= 0 && b <= 50) {
                    myQArr[1][i] = b;
                }
                if (n >= 1 && n <= 15) {
                    myQArr[2][i] = n;
                }
            }
            scanner.close();

            for (int i = 0; i < q; i++) {

                int s = myQArr[0][i];
                for (int j = 0; j < myQArr[2][i]; j++) {
                    s += Math.pow(2, j) * myQArr[1][i];
                    System.out.printf("%d ", s);
                }
                System.out.println();
            }
        }
    }
}

