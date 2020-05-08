package org.example.model;

public class Coord {

    private double x;
    private double y;
    private double z;

    public Coord(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //===== GETTERS AND SETTERS =====

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
