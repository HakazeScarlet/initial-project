package learn_oop_2.animals;

class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
    }

    @Override
    protected void makeNoise() {
        System.out.println("Dog say woof");
    }

    @Override
    protected void eat() {
        System.out.println("Dog eat a meat");
    }

    @Override
    protected String getDescription() {
        return name;
    }
}
