package learn_oop;

// schema
public class Car {

    // fields
    private String typeEngine;
    private int wheels;
    private String colour; // by default is null
    private Integer temperature; // by default is null
    private int speed; // by default is 0
    private int acceleration;

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
