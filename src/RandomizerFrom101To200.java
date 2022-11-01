import java.util.Random;

public class RandomizerFrom101To200 {

    public static void main(String[] args) {

        Random random = new Random();

        int min = 101;
        int max = 200;
        int number = random.nextInt(max - min) + min;

        System.out.println("Random number (100-200] is: " + number);
    }
}
