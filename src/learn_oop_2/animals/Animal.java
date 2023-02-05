package learn_oop_2.animals;

abstract class Animal {

    protected String name;

    abstract void makeNoise();
    abstract void eat();
    abstract String getDescription();

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
