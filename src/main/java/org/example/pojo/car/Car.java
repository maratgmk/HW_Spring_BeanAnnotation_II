package org.example.pojo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public abstract class Car {
    private final Engine engine;


    public Car( Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
