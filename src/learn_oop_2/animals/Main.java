package learn_oop_2.animals;

class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Ahri");
        animals[1] = new Chicken("Coco");
        animals[2] = new Dog("Jerri");

//        for (int index = 0; index < animals.length; index++) {
//            vet.treatAnimal(animals[index]);
//        }

        Veterinary veterinary = new Veterinary();
        for (Animal animal : animals) {
            veterinary.treatAnimal(animal);
        }

        System.out.println("-----------");

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            System.out.println("--------");
        }
    }
}
