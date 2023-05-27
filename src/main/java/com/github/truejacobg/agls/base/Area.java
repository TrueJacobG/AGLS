package com.github.truejacobg.agls.base;

import com.github.truejacobg.agls.base.ground.Fertility;
import com.github.truejacobg.agls.base.ground.GroundFactory;

public class Area {
    private int width;
    private int height;
    private Square[][] area;


    public Area(int width, int height) {
        this.width = width;
        this.height = height;

        initArea();
        fillWithGround();
        fillWithAnimals();
    }

    private void fillWithGround() {
        GroundFactory groundFactory = new GroundFactory(Fertility.MEDIUM);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                area[i][j].setGround(groundFactory.getGround());
            }
        }
    }

    private void fillWithAnimals() {

    }

    private void initArea() {
        area = new Square[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                area[i][j] = new Square();
            }
        }
    }
}
