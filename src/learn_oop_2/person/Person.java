package learn_oop_2.person;

public class Person {

    private String fullName;
    private int age;


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;

    }

    void talk(String fullName) {
        System.out.println("This " + fullName + " talk");
    }
}
