package learn_oop.animal;

public class Animal {

    private String type; // cat, dog, frog

    public Animal() {

    }

    protected void say(String sound) {
        System.out.println(sound);
    }
}
