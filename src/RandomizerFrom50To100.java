import java.util.Random;

public class RandomizerFrom50To100 {

    public static void main(String[] args) {
        Random random = new Random();

        int min = 50;
        int max = 100;
        int number = random.nextInt(max - min) + min;

        System.out.println("Random number from 50 to 100 is: " + number);
    }
}
