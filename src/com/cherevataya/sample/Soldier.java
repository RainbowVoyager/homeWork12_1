package com.cherevataya.sample;

public class Soldier extends MovableObject {
    public Soldier(int coordinateX, int getCoordinateY) {
        super(coordinateX, getCoordinateY);
    }

    public void shoot() {
        System.out.println("Fire pew pew pew");
    }


    @Override
    public String toString() {
        return "Soldier{" +
                "coordinateX=" + coordinateX +
                ", getCoordinateY=" + getCoordinateY +
                '}';
    }
}
