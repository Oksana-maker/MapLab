package org.itstep;

import java.util.TreeSet;

public class Program extends TreeSet<Program> {
    private String name;

    public Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
