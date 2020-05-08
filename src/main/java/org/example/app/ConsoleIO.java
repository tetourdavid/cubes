package org.example.app;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleIO implements IO {

    public final InputStream in;
    public final PrintStream out;
    public final Scanner scanner;

    public ConsoleIO(InputStream in, PrintStream out) {
        this.in = in;
        this.out = out;
        this.scanner = new Scanner(in);
    }

    public ConsoleIO() {
        this(System.in, System.out);
    }

    @Override
    public InputStream input() {
        return in;
    }

    @Override
    public PrintStream output() {
        return out;
    }
}
