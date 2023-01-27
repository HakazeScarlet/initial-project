package learn_oop_2.animals;

public class Dog extends Animal {

    Animal dog = new Animal();

    protected void makeNoise() {
        System.out.println("The " + dog + " say Woof");
    }

    protected void eat() {
        System.out.println("The " + dog + " eat anything");
    }
}
