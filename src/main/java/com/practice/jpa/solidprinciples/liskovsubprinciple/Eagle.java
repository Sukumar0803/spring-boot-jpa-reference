package com.practice.jpa.solidprinciples.liskovsubprinciple;

public class Eagle implements ICanFly {

    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("I'm flying " + name);
    }

    @Override
    public void walk() {
        System.out.println("I'm walking " + name);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }
}
