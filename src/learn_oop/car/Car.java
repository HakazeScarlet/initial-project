package learn_oop.car;

// schema
public class Car {

    // fields
    private String typeEngine;
    private int wheels;
    private String colour; // by default is null
    private Integer temperature; // by default is null
    private int speed; // by default is 0
    private int acceleration;
    private Engine engine;

    public Car() {

    }

    // constructor
    public Car(int initialSpeed) {
        System.out.println(speed);
//        speed = initialSpeed;
        this.speed = initialSpeed;
        System.out.println(speed);
    }

    // methods
    public void accelerate(int acceleration) {
        System.out.println(acceleration);
    }
}


// 1. null in Java
// 2. See videos 5-6
// 3. See examples about OOP in Java


// Oracle, Baeldung, StackOverflow


// client (username, email) -> server (username, email) -> database (User table - username, email)
// server: Controller (class1) -> Service (class2) -> Repository (class3)
