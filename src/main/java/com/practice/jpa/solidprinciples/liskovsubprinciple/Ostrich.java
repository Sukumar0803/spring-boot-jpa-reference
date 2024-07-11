package com.practice.jpa.solidprinciples.liskovsubprinciple;

public class Ostrich implements IWalk {
    private String name;
    public Ostrich(String name) {
        this.name = name;
    }
    @Override
    public void walk() {
        System.out.println("I am walkingt "+this.name);
    }

    @Override
    public String toString() {
        return "Ostrich{" +
                "name='" + name + '\'' +
                '}';
    }
}
