package learn_oop_2.animals;

class Dog extends Animal {

    void makeNoise() {
        System.out.println("Dog say woof");
    }
    void eat() {
        System.out.println("Dog eat a meat");
    }
    String getDescription() {
        return name;
    }
}

