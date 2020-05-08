package org.example.model;

public interface Solid {

    double intersectionVolume(Cube cube);

    boolean intersects(Cube cube);
}
