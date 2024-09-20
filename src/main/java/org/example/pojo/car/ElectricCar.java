package org.example.pojo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Tesla")
public class ElectricCar extends Car {
    private final ElectricEngine electricEngine;

    @Autowired
    public ElectricCar(@Qualifier("electricEngine") Engine engine, ElectricEngine electricEngine) {
        super(engine);
        this.electricEngine = electricEngine;
    }

    @Override
    public String toString() {
        return "ElectricCar has electricEngine " + electricEngine.useEnergy();
    }
}
