package learn_oop_2.com.company.vehicles;

import learn_oop_2.com.company.details.Engine;
import learn_oop_2.com.company.professions.Driver;

public class Main {
    public static void main(String[] args) {

        Driver driverInCar = new Driver();
        Engine engineInCar = new Engine();
        Car redCar = new Car(driverInCar, engineInCar);

    }
}