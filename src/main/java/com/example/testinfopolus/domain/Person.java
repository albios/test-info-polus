package com.example.testinfopolus.domain;

import lombok.Getter;

import java.util.Collections;
import java.util.List;

/**
 * Entity class
 */
@Getter
public class Person {

    private int id;
    private String name;

//    @OneToMany(mappedBy="person")
    private List<Car> ownedCars;

    public Person(int id, String name) {
        this(id, name, Collections.emptyList());
    }

    public Person(int id, String name, List<Car> ownedCars) {
        this.id = id;
        this.name = name;
        this.ownedCars = ownedCars;
    }
}
