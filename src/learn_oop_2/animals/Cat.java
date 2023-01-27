package learn_oop_2.animals;

public class Cat extends Animal {

    private double jumpHeight;

    Animal cat = new Animal();

    protected void makeNoise() {
        System.out.println("The " + cat + " say Meow");
    }
    protected void eat() {
        System.out.println("The " + cat + " eat cat's " + food);
    }


}
