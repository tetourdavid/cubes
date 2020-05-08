package org.example.app;

import org.example.model.Coord;
import org.example.model.Cube;

public class CubeDialogue {

    public static final String GREETING = "Console cubes started.";
    public static final String DESCRIPTION = "You will be asked to enter the details of two cubes.";
    public static final String GOODBYE = "Bye.";

    public final ConsoleIO io;

    public CubeDialogue(ConsoleIO io) {
        this.io = io;
    }

    /** Collects information about two cubes and describes their intersection. */
    public void run() {
        io.out.println(GREETING);
        io.out.println(DESCRIPTION);

        Cube first = askAbout("first");
        Cube second = askAbout("second");

        if (first.intersects(second)) {
            io.out.println("The two cubes intersect.");
            io.out.println("The volume of the intersection is: " + first.intersectionVolume(second));
        } else {
            io.out.println("The two cubes do not intersect.");
        }
        io.out.println(GOODBYE);
    }

    /** @return cube initialized from values given by console input.*/
    private Cube askAbout(String cube) {
        io.out.println("Enter the length of an edge of the " + cube + " cube: ");
        double edge = io.scanner.nextDouble();
        io.out.println("Enter the x coordinate of the " + cube + " cube: ");
        double x = io.scanner.nextDouble();
        io.out.println("Enter the y coordinate of the " + cube + " cube: ");
        double y = io.scanner.nextDouble();
        io.out.println("Enter the z coordinate of the " + cube + " cube: ");
        double z = io.scanner.nextDouble();
        return new Cube(new Coord(x, y, z), edge);
    }
}
