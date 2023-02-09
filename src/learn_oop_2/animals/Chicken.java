package learn_oop_2.animals;

class Chicken extends Animal{

    protected Chicken(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Chicken say ko-ko");
    }

    public void eat() {
        System.out.println("Chicken eat a corn");
    }

    String getDescription() {
        return name;
    }

}
