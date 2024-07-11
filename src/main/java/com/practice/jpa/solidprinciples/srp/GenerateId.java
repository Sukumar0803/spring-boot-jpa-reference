package com.practice.jpa.solidprinciples.srp;

public class GenerateId {

    public Integer generateId(String name) {
        return name.hashCode();
    }
}
