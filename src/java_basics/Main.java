package java_basics;

import java.util.List;

public class Main {

    private static final int CONST_INT = 20;
    private static int simpleInt = 5;

    public static void main(String[] args) {
//        System.out.println(simpleInt);
//        simpleInt = 10;
//        System.out.println(simpleInt);
//
//        System.out.println(CONST_INT);

        System.out.printf("%d", 666);
        System.out.printf("%s\n", 234);
        System.out.printf("%s\n", "Test");
        System.out.printf("%s\n", "Test");

        System.out.printf("%s\n", "My cat said: \"MEOW\""); // ' \'Something\' '
        System.out.println("My cat said: \"MEOW\"");


        System.out.println();
    }

    public static void test() {
        boolean b = true; // by default false

        Long l = 123456789L;
        Float f = 12.9F;
    }

    public static boolean isEmpty(List<Integer> integers) {
        return false;
//        return integers.size() == 0;
    }

    // constants in java (https://www.programiz.com/java-programming/variables-literals)
}
