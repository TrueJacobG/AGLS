package com.github.truejacobg.agls.base.ground;

public enum Fertility {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int value;

    Fertility(int i) {
        this.value = i;
    }

    int getValue() {
        return value;
    }
}
