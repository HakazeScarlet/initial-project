package learn_oop_2.animals;

public class Horse extends Animal {

    private int speed;

    public Horse(String food, String location) {
        super(food, location);
    }

    Animal horse = new Animal(food, location);

    protected void makeNoise() {
        System.out.println("The " + horse + " say i-go-go");
    }

    protected void eat() {
        System.out.println("The " + horse + " eat horse's " + food);
    }
}
