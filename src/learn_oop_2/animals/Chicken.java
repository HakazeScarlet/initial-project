package learn_oop_2.animals;

class Chicken extends Animal{

    public Chicken(String name) {
        this.name = name;
    }

    void makeNoise() {
        System.out.println("Chicken say ko-ko");
    }
    void eat() {
        System.out.println("Chicken eat a corn");
    }
    String getDescription() {
        return name;
    }

}
