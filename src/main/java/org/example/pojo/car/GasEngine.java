package org.example.pojo.car;

import org.springframework.stereotype.Component;

@Component
public class GasEngine implements Engine{
    @Override
    public String useEnergy() {
        return "that used oil";
    }
}
