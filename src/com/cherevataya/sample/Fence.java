package com.cherevataya.sample;

public class Fence extends Generic {
    @Override
    public String toString() {
        return "Fence{" +
                "coordinateX=" + coordinateX +
                ", getCoordinateY=" + getCoordinateY +
                '}';
    }

    public Fence(int coordinateX, int getCoordinateY) {
        super(coordinateX, getCoordinateY);
        destruction = true;

    }
}
