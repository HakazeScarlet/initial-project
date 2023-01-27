package learn_oop_2.com.company.vehicles;

import learn_oop_2.com.company.details.Engine;
import learn_oop_2.com.company.professions.Driver;

class Car {

    private String carBrand;
    private String carClass;
    private double weight;
    private Driver driver;
    private final Engine engine;

    public Car(Driver outerDriver, Engine outerEngine) {
        this.driver = outerDriver;
        this.engine = outerEngine;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

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

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
