package simple_tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolJournal {

    private static final String SPACE_PATTERN = "\\s+";
    private static final int MAX_MARKS_COUNT = 100000;
    private static final int MIN_MARKS_COUNT = 1;
    private static final int MIN_MARK_VALUE = 2;
    private static final int MAX_MARK_VALUE = 5;
    private static final int MIN_NORMAL_MARK_VALUE = 4;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks count on the day: ");
        int marksCount = scanner.nextInt();
        System.out.println("Enter marks on the day: ");
        int marks = scanner.nextInt();

        while (!isSuitableMarksCount(marksCount)) {
            System.out.println("Uncorrected marks count on the day. Please, try again: ");
            marksCount = scanner.nextInt();
        }
//
//        while (!isSuitableMarksValue(marks)) {
//            System.out.println("Uncorrected marks value. Please, try again: ");
//            marks = scanner.nextInt();
//        }

        scanner.useDelimiter(SPACE_PATTERN);
        int[] normalMarks = new int[marksCount];
        System.out.println("Enter two numbers separated by a space: ");
        try {
            for (int row = 0; row < rowSize; row++) {
                for (int col = 0; col < columnSize; col++) {
                    normalMarks[row][col] = Math.abs(scanner.nextInt());
                }
            }
        } catch (InputMismatchException e) {
            throw new MatrixTurner.LimitOfIntegerValueException(LIMIT_OF_INT_VALUE_MESSAGE + ": " + Integer.MAX_VALUE, e);
        }

        scanner.close();

        return normalMarks;
    }

    private static boolean isSuitableMarksCount(int count) {
        return count >= MIN_MARKS_COUNT && count <= MAX_MARKS_COUNT;
    }

    private static boolean isSuitableMarksValue(int value) {
        return value <= MAX_MARK_VALUE && value >= MIN_MARK_VALUE;
    }

    private static boolean isSuitableNormalMarksValue(int value) {
        return value <= MAX_MARK_VALUE && value >= MIN_NORMAL_MARK_VALUE;
    }
}
