package learn_oop_2.animals;

public class Animal {

    private String animal;
    private String food;
    private String location;

    protected void makeNoise() {
        System.out.println("The " + animal + " make a noise");
    }

    protected void eat() {
        System.out.println("The " + animal + " eat a food");
    }

    protected void sleep() {
        System.out.println("The " + animal + " sleep");
    }
}
