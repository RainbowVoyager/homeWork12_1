package com.cherevataya.sample;

public class MovableObject extends Generic {

    public void move() {
        System.out.println("Noise of movement");
    }

    public MovableObject(int coordinateX, int getCoordinateY) {
        super(coordinateX, getCoordinateY);
    }
}
