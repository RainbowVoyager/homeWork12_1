package com.cherevataya.sample;

public class Generic {
    protected int coordinateX;
    protected int getCoordinateY;
    protected boolean destruction;

    public Generic(int coordinateX, int getCoordinateY) {
        this.coordinateX = coordinateX;
        this.getCoordinateY = getCoordinateY;
    }

    public void draw() {
        System.out.println("display");
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getGetCoordinateY() {
        return getCoordinateY;
    }

    public boolean isDestruction() {
        return destruction;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "coordinateX=" + coordinateX +
                ", getCoordinateY=" + getCoordinateY +
                '}';
    }
}
