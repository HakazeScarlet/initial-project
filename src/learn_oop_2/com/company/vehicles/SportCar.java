package learn_oop_2.com.company.vehicles;

import learn_oop_2.com.company.details.Engine;
import learn_oop_2.com.company.professions.Driver;

public class SportCar extends Car {

    private double maxSpeed;

    private SportCar(Driver driver, Engine engine) {
        super(driver, engine);
    }
}
