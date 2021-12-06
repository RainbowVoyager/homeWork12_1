package com.cherevataya.sample;

public class Tower extends Generic {
    @Override
    public String toString() {
        return "Tower{" +
                "coordinateX=" + coordinateX +
                ", getCoordinateY=" + getCoordinateY +
                '}';
    }

    public Tower(int coordinateX, int getCoordinateY) {
        super(coordinateX, getCoordinateY);
        destruction = false;
        System.out.println("Tower is immortal and unbreakable");


    }

}
