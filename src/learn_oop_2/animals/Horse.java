package learn_oop_2.animals;

public class Horse extends Animal {

    private int speed;

    Animal horse = new Animal();

    protected void makeNoise() {
        System.out.println("The " + horse + " say i-go-go");
    }

    protected void eat() {
        System.out.println("The " + horse + " eat horse's " + food);
    }
}
