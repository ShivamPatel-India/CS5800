package com.homework1.composition;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("File: " + name);
    }
}
