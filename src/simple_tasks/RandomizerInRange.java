package simple_tasks;

import java.util.Random;

public class RandomizerInRange {

    public static void main(String[] args) {
        System.out.println("Random number (20-50) is: " + get(21, 49));
        System.out.println("Random number [50-100] is: " + get(50, 100));
        System.out.println("Random number (100-200] is: " + get(101, 200));
    }

    public static int get(int from, int to) {
        return new Random().nextInt(to - from) + from;
    }
}
