import java.util.Random;

// TODO: существительное
public class Randomizer {

    public static void main(String[] args) {
        System.out.println("Random number (20-50) is: " + (RandomNumber(21, 49)));
        System.out.println("Random number [50-100] is: " + (RandomNumber(50, 100)));
        System.out.println("Random number (100-200] is: " + (RandomNumber(101, 200)));
    }

    // TODO: глагол
    public static int RandomNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max - min) + min;
        return randomNumber;
    }
}
