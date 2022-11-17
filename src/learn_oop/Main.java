package learn_oop;

public class Main {

    public static void main(String[] args) {
        // methods overloading
        print("Meow");
        print(12);
        print(3, 5);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(int number) {
        System.out.println(number);
    }

    // wrong method
//    public static void print(int anotherNumber) {
//        System.out.println(anotherNumber);
//    }

    public static void print(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    // method description: type name(type parameter1, type parameter2, type parameter3, ...) { ... }
    // method call: name(2, 5, 7, ...);
}
