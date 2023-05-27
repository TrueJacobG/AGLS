package com.github.truejacobg.agls.base;

import com.github.truejacobg.agls.base.ground.Ground;
import com.github.truejacobg.agls.base.living.animal.Animal;

import java.util.Optional;

public class Square {
    private Ground ground;
    private Optional<Animal> animal;

    public Square() {
        this.ground = null;
        this.animal = Optional.empty();
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }
}
