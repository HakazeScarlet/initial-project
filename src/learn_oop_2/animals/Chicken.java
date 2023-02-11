package learn_oop_2.animals;

class Chicken extends Animal {

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    protected void makeNoise() {
        System.out.println("Chicken say ko-ko");
    }

    @Override
    protected void eat() {
        System.out.println("Chicken eat a corn");
    }

    @Override
    protected String getDescription() {
        return name;
    }
}
