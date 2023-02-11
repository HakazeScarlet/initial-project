package learn_oop_2.com.company.vehicles;

import learn_oop_2.com.company.details.Engine;
import learn_oop_2.com.company.professions.Driver;

class Car {

    private final Engine engine;

    private String carBrand;
    private String carClass;
    private double weight;
    private Driver driver;

    public Car(Driver outerDriver, Engine outerEngine) {
        this.driver = outerDriver;
        this.engine = outerEngine;
    }

    public void start() {
        System.out.println("Go");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
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

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine.getCompany() +
                '}';
    }
}
