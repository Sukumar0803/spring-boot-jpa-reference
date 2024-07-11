package com.practice.jpa.solidprinciples.liskovsubprinciple;

public class Parrot implements ICanFly {

    private  String name;
    public Parrot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Parrot fly");
    }

    @Override
    public void walk() {
        System.out.println("Parrot walk");
    }
}
