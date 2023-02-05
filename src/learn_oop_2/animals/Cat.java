package learn_oop_2.animals;

class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }

    void makeNoise() {
        System.out.println("Cat say meow");
    }
    void eat() {
        System.out.println("Cat eat a fish");
    }
    String getDescription() {
        return name;
    }

}

