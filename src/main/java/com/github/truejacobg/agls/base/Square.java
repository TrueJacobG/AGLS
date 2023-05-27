package com.github.truejacobg.agls.base;

import java.util.Optional;

public class Square {
    private Grass grass;
    private Optional<Animal> animal;

    public Square(){
        this.grass = new Grass();
        this.animal = Optional.empty();
    }
}
