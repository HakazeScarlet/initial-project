package learn_oop_2.person;

public class Person {

    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void talk(String fullName) {
        System.out.println("This " + fullName + " is talking");
    }

    private String getFullName() {
        return fullName;
    }

    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
