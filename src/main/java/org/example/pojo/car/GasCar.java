package org.example.pojo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("BMW")
public class GasCar extends Car {
    private final GasEngine gasEngine;

    @Autowired
    public GasCar(@Qualifier("gasEngine") Engine engine, GasEngine gasEngine) {
        super(engine);
        this.gasEngine = gasEngine;
    }

    @Override
    public String toString() {
        return "GasCar has inside " +
                " gasEngine " + gasEngine.useEnergy();
    }
}
