package learn_oop_2.animals;

abstract class Animal {

    protected String name;

    protected abstract void makeNoise();

    protected abstract void eat();

    protected abstract String getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
