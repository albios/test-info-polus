package com.example.testinfopolus.domain;

import lombok.Getter;

/**
 * Entity class
 */
@Getter
public class Car {
    private int id;
    private String name;

    // @ManyToOne
    private Person owner;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
