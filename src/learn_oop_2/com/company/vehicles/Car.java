package learn_oop_2.com.company.vehicles;

import learn_oop_2.com.company.details.Engine;
import learn_oop_2.com.company.professions.Driver;

public class Car {

    private String carBrand;
    private String carClass;
    private double weight;

    Driver driver1 = new Driver();
    Engine engine1 = new Engine();

    protected void start() {
        System.out.println("Go");
    }

    protected void stop() {
        System.out.println("Stop");
    }

    protected void turnRight() {
        System.out.println("Turn to right");
    }

    protected void turnLeft() {
        System.out.println("Turn to left");
    }

    public String toString() {

        return
    }

}
