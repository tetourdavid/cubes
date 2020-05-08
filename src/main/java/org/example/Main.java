package org.example;

import org.example.app.ConsoleIO;
import org.example.app.CubeDialogue;

public class Main {

    public static void main(String[] args) {
        ConsoleIO io = new ConsoleIO();
        new CubeDialogue(io).run();
    }
}
