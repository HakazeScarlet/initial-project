package learn_oop_2.animals;

class Cat extends Animal {

    protected Cat(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Cat say meow");
    }

    public void eat() {
        System.out.println("Cat eat a fish");
    }

    public String getDescription() {
        return name;
    }

}

