package com.github.truejacobg.agls.base.ground;

public class Soil implements Ground {
    private final Fertility fertility = Fertility.HIGH;

    @Override
    public Fertility getFertilityLevel() {
        return fertility;
    }
}
