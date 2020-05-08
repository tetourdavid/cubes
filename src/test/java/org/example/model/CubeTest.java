package org.example.model;

import org.example.model.Coord;
import org.example.model.Cube;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CubeTest {

    @Test
    void testIntersectionVolumeOfIdenticalCubes() {
        Cube first = new Cube(2);
        Cube second = new Cube(2);
        assertEquals(first.intersectionVolume(second),8);
    }

    @Test
    void testIntersectionVolumeOfEnclosedCubes() {
        Cube first = new Cube(new Coord(1,-1,0), 3);
        Cube second = new Cube(7);
        assertEquals(first.intersectionVolume(second),27);
    }

    @Test
    void testIntersectionVolumeOfPartiallyOverlappingCubes() {
        Cube first = new Cube(new Coord(2,2,2), 2);
        Cube second = new Cube(4);
        assertEquals(first.intersectionVolume(second),1);
    }

    @Test
    void testIntersectionVolumeOfDistantCubes() {
        Cube first = new Cube(new Coord(10,0,0), 2);
        Cube second = new Cube(new Coord(0,0,0), 2);
        assertEquals(first.intersectionVolume(second),0);
    }

    @Test
    void testIntersectionOfDistantCubes() {
        Cube first = new Cube(new Coord(10,0,0), 2);
        Cube second = new Cube(new Coord(0,0,0), 2);
        assertFalse(first.intersects(second));
    }

    @Test
    void testIntersectionOfIdenticalCubes() {
        Cube first = new Cube(new Coord(0,0,0), 2);
        Cube second = new Cube(new Coord(0,0,0), 2);
        assertTrue(first.intersects(second));
    }

    @Test
    void testIntersectionOfPartiallyOverlappingCubes() {
        Cube first = new Cube(new Coord(2,2,2), 2);
        Cube second = new Cube(4);
        assertTrue(first.intersects(second));
    }
}
