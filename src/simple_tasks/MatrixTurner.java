package simple_tasks;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixTurner {

    private static final String SPACE_PATTERN = "\\s+";
    private static final int MAX_MATRIX_SIZE = 1000;
    private static final int MIN_MATRIX_SIZE = 1;
    private static final String LIMIT_OF_INT_VALUE_MESSAGE = """
        The maximum number of an integer type is: %d.
        Please, enter values below the limit""";

    public static void main(String[] args) {
        int[][] turnedMatrix = turnTo90Degrees(createAndFillMatrix());
        print(turnedMatrix);
    }

    private static int[][] turnTo90Degrees(int[][] matrix) {
        int[][] turnedMatrix = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                turnedMatrix[col][matrix.length - row - MIN_MATRIX_SIZE] = matrix[row][col];
            }
        }
        return turnedMatrix;
    }

    private static int[][] createAndFillMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter matrix sizes (considering the following condition: 1 <= rows,columns <= 10^3)");
        int rowSize = scanner.nextInt();
        int columnSize = scanner.nextInt();
        while (!isSuitableMatrixSize(rowSize) || !isSuitableMatrixSize(columnSize)) {
            System.out.println("Matrix sizes aren't suitable. Please, try enter their again: ");
            rowSize = scanner.nextInt();
            columnSize = scanner.nextInt();
        }

        scanner.useDelimiter(SPACE_PATTERN);
        int[][] matrix = new int[rowSize][columnSize];
        System.out.println("Enter two numbers separated by a space: ");
        try {
            for (int row = 0; row < rowSize; row++) {
                for (int col = 0; col < columnSize; col++) {
                    matrix[row][col] = Math.abs(scanner.nextInt());
                }
            }
        } catch (InputMismatchException e) {
            throw new LimitOfIntegerValueException(LIMIT_OF_INT_VALUE_MESSAGE + ": " + Integer.MAX_VALUE, e);
        }

        scanner.close();

        return matrix;
    }

    private static boolean isSuitableMatrixSize(int size) {
        return size > MIN_MATRIX_SIZE && size < MAX_MATRIX_SIZE;
    }

    private static void print(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int col : rows) {
                System.out.printf("%s ", col);
            }
            System.out.println();
        }
    }

    private static class LimitOfIntegerValueException extends RuntimeException {

        public LimitOfIntegerValueException(String message, Exception exception) {
            super(message, exception);
        }
    }
}
