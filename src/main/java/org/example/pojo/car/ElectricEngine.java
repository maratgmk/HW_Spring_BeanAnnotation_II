package org.example.pojo.car;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine{
    @Override
    public String useEnergy() {
        return "that using charged electric battery";
    }
}
