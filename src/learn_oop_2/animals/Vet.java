package learn_oop_2.animals;

public class Vet extends Animal{

    public Vet(String food, String location) {
        super(food, location);
    }

    void treatAnimal(Animal animal) {

        System.out.println("Food of " + animal + " is " + food + " and it's location is " + "Location");

    }
}
