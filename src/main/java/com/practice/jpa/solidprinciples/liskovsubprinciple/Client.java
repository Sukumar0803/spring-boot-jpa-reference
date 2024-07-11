package com.practice.jpa.solidprinciples.liskovsubprinciple;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        // subclass - Parrort, Eagle
        List<ICanFly> flyList = new ArrayList<>();
        // ICanFly - Parent
        ICanFly p = new Parrot("Parrot rei");
        flyList.add(p);
        // It was substituting subclass
        ICanFly e = new Eagle("I am Eagle");
        flyList.add(e);
        System.out.println(flyList);


        List<IWalk> walksList = new ArrayList<>();
        IWalk d = new Duck("duck raa");
        walksList.add(d);
        IWalk o = new Ostrich("Ostrich");
        walksList.add(o);
        System.out.println(walksList);

        flyList.forEach(bird -> {
            bird.fly();
            bird.walk();
        });

        walksList.forEach(bird -> {
            bird.walk();
        });
    }
}
