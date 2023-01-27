package learn_oop_2.animals;

public class Dog extends Animal {

    public Dog(String food, String location) {
        super(food, location);
    }

    Animal dog = new Animal(food, location);

    protected void makeNoise() {
        System.out.println("The " + dog + " say Woof");
    }
    protected void eat() {
        System.out.println("The " + dog + " eat dog's " + food);
    }

}
