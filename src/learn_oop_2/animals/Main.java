package learn_oop_2.animals;

public class Main extends Animal {

    public Main(String food, String location) {
        super(food, location);
    }

    public static void main(String[] args) {

        Animal[] animalArr = new Animal[10];

        for (Animal animal : animalArr) {
            System.out.println(animalArr + " visit to Vet");
        }
    }
}
