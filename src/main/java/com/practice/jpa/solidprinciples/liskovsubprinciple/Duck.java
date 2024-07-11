package com.practice.jpa.solidprinciples.liskovsubprinciple;

public class Duck implements IWalk {
    private String name;
    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void walk() {
        System.out.println("Duck walk");
    }
}
