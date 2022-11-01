import java.util.Random;

public class RandomizerFrom21To49 {

    public static void main(String[] args) {

        Random random = new Random();
        int min = 21;
        int max = 49;
        int number = random.nextInt(max - min) + min;

        System.out.println("Random number (20-50) is: " + number);
    }
}
