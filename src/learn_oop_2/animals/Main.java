package learn_oop_2.animals;

public class Main {
    public static void main(String[] args) {

        Animal[] animalArr = new Animal[3];
        Vet vet = new Vet();

        animalArr[0] = new Cat("Ahri");
        animalArr[1] = new Chicken("Ccc");
        animalArr[2] = new Dog("Jerri");

//        for (int index = 0; index < animalArr.length; index++) {
//            vet.treatAnimal(animalArr[index]);
//        }

        for (Animal animal : animalArr) {
            vet.treatAnimal(animal);
        }

        System.out.println("-----------");

        for (Animal animal : animalArr) {
            animal.makeNoise();
            animal.eat();
            System.out.println("--------");
        }
    }
}
