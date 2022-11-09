import java.util.Random;

public class Randomizer {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Random number (20-50) is: " + (RandomNumber(21 , 49)));
        System.out.println("Random number [50-100] is: " + (RandomNumber(50 , 100)));
        System.out.println("Random number (100-200] is: " + (RandomNumber(101 , 200)));
    }
    public static int RandomNumber (int min , int max) {
        return new Random().nextInt(max - min) + min;
    }
}
