package learn_oop_2.com.company.vehicles;

import learn_oop_2.com.company.details.Engine;
import learn_oop_2.com.company.professions.Driver;

public class Lorry extends Car {

    private double carrying;

    public Lorry(Driver outerDriver, Engine outerEngine) {

        super(outerDriver, outerEngine);

    }
}
