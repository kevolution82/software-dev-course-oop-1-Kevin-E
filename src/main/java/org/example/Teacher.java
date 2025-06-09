package org.example;

public class Teacher {
    private String name;
    private String className;

    public Teacher(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // This displays which teacher teaches which class
    @Override
    public String toString() {
        return name + " teaches " + className;
    }
}
