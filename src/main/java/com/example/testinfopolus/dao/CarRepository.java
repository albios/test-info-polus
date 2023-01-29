package com.example.testinfopolus.dao;

import com.example.testinfopolus.domain.Car;

/**
 * Sample repository, not needed for this test task
 */
public class CarRepository extends AbstractRepository<Car> {

    @Override
    Car getById(int id) {
        return new Car(0, "0");
    }

    @Override
    Car save(Car entity) {
        return new Car(0, "0");
    }
}
