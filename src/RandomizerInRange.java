import java.util.Random;

public class RandomizerInRange {

    public static void main(String[] args) {
        System.out.println("Random number (100-200] is: " + getRandNumberFromRange(101, 200));
        System.out.println("Random number from 50 to 100 is: " + getRandNumberFromRange(50, 100));
        System.out.println("Random number (20-50) is: " + getRandNumberFromRange(21, 49));
    }

    public static int getRandNumberFromRange(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }
}
