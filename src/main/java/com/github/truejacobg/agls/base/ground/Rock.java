package com.github.truejacobg.agls.base.ground;

public class Rock implements Ground {
    private final Fertility fertility = Fertility.MEDIUM;

    @Override
    public Fertility getFertilityLevel() {
        return fertility;
    }
}
