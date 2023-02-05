package learn_oop_2.animals;

class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
    }

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

