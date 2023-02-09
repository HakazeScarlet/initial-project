package learn_oop_2.animals;

class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }

    @Override
    protected void makeNoise() {
        System.out.println("Cat say meow");
    }

    @Override
    protected void eat() {
        System.out.println("Cat eat a fish");
    }

    @Override
    protected String getDescription() {
        return name;
    }
}
