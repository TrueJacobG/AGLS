package com.github.truejacobg.agls.base.ground;

import java.util.concurrent.ThreadLocalRandom;

public class GroundFactory {
    private final Fertility fertilityLevel;

    public GroundFactory(Fertility fertilityLevel) {
        this.fertilityLevel = fertilityLevel;
    }

    public Ground getGround() {
        int randomValue = Math.abs(ThreadLocalRandom.current().nextInt()) % (10 + fertilityLevel.getValue() * fertilityLevel.getValue());

        Ground result;
        if (randomValue < 5) {
            result = new Sand();
        } else if (randomValue < 10) {
            result = new Rock();
        } else {
            result = new Soil();
        }

        return result;
    }
}
