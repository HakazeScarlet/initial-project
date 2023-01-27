package learn_oop_2.animals;

public class Animal {

    protected String animal;
    protected String food;
    protected String location;

    protected void makeNoise() {
        System.out.println("The " + animal + " make a noise");
    }

    protected void eat() {
        System.out.println("The " + animal + " eat " + food);
    }
    protected void sleep() {
        System.out.println("The " + animal + " sleep");
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getAnimal() {
        return animal;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
