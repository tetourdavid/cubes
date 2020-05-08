package org.example.model;

public class Cube implements Solid {

    private Coord center;
    private double edge;

    /** @return volume of the intersection between this cube and the given cube. */
    @Override
    public double intersectionVolume(Cube cube) {
        Coord thisMin = this.min();
        Coord thisMax = this.max();
        Coord thatMin = cube.min();
        Coord thatMax = cube.max();
        double xEdge = Math.min(thisMax.getX(), thatMax.getX()) - Math.max(thisMin.getX(), thatMin.getX());
        double yEdge = Math.min(thisMax.getY(), thatMax.getY()) - Math.max(thisMin.getY(), thatMin.getY());
        double zEdge = Math.min(thisMax.getZ(), thatMax.getZ()) - Math.max(thisMin.getZ(), thatMin.getZ());
        double volume = xEdge * yEdge * zEdge;
        return Math.max(volume, 0);
    }

    @Override
    public boolean intersects(Cube cube) {
        return intersectionVolume(cube) > 0;
    }

    /** @return coordinates of a point on a cube closest to the origin. */
    public Coord min() {
        double x = center.getX() - edge / 2;
        double y = center.getY() - edge / 2;
        double z = center.getZ() - edge / 2;
        return new Coord(x, y, z);
    }

    /** @return coordinates of a point on a cube closest to the origin. */
    public Coord max() {
        double x = center.getX() + edge / 2;
        double y = center.getY() + edge / 2;
        double z = center.getZ() + edge / 2;
        return new Coord(x, y, z);
    }

    /** Full constructor. */
    public Cube(Coord center, double edge) {
        if (edge <= 0) throw new IllegalArgumentException("Positive edge required, '" + edge +"' given.");
        this.center = center;
        this.edge = edge;
    }

    /** Shortened constructor initializing cube at the origin (0,0,0). */
    public Cube(double edge) {
        this(new Coord(0,0,0), edge);
    }

    //===== GENERATED GETTERS AND SETTERS =====

    public Coord getCenter() {
        return center;
    }

    public void setCenter(Coord center) {
        this.center = center;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
}
