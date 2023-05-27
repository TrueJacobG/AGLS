package com.github.truejacobg.agls.base.ground;

public class Sand implements Ground {
    private final Fertility fertility = Fertility.LOW;

    @Override
    public Fertility getFertilityLevel() {
        return fertility;
    }
}
