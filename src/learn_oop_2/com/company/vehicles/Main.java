package learn_oop_2.com.company.vehicles;

import learn_oop_2.com.company.details.Engine;
import learn_oop_2.com.company.professions.Driver;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Engine engine = new Engine();
        Car car = new Car(driver, engine);

    }
}
