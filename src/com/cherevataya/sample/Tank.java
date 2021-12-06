package com.cherevataya.sample;

public class Tank extends MovableObject {

    public Tank(int coordinateX, int getCoordinateY) {
        super(coordinateX, getCoordinateY);
    }

    public void shoot() {
        System.out.println("Fire pew pew pew");
    }

    public void reloading() {
        System.out.println("Noise of reloading");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "coordinateX=" + coordinateX +
                ", getCoordinateY=" + getCoordinateY +
                '}';
    }
}
