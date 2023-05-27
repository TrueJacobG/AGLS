package com.github.truejacobg.agls.base;

import java.util.Arrays;

public class Area {
    private int width;
    private int height;
    private Square[][] area;


    public Area(int width, int height){
        this.width = width;
        this.height = height;

        initArea();
        fillWithAnimals();
    }

    private void fillWithAnimals() {
        
    }

    private void initArea(){
        area = new Square[height][width];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                area[i][j] = new Square();
            }
        }
    }
}
