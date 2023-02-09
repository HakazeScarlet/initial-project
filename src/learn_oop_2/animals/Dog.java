package learn_oop_2.animals;

class Dog extends Animal {

    protected Dog(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Dog say woof");
    }

    public void eat() {
        System.out.println("Dog eat a meat");
    }

    String getDescription() {
        return name;
    }

}

