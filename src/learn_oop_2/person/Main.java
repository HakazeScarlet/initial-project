package learn_oop_2.person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Andrey", 27);
        Person person2 = new Person("Olga", 27);
        person2.talk("Andrey");
    }
}
