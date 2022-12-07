import java.util.Random;

public class RandomizerInRange {

    public static void main(String[] args) {
        System.out.println("Random number (20-50) is: " + (getNumber(21, 49)));
        System.out.println("Random number [50-100] is: " + (getNumber(50, 100)));
        System.out.println("Random number (100-200] is: " + (getNumber(101, 200)));
    }

    public static int getNumber(int from, int to) {
        return new Random().nextInt(to - from) + from;
    }

    // access modifier: pubic
    // static modifier: static

    // method returned type: (int, String, Car, int[], List<Double>, ...) OR void type
    // name of method: getNumber
    // method parameters: (int from, int to)
    // method body: {...}; visibility scope - https://en.wikipedia.org/wiki/Scope_(computer_science)
    // returned value: return something

    // type name(parameters...) { return ... }
    // void name(parameters...) { ... }
}
