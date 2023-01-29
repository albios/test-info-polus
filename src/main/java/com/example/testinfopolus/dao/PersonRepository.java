package com.example.testinfopolus.dao;

import com.example.testinfopolus.domain.Car;
import com.example.testinfopolus.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PersonRepository extends AbstractRepository<Person> {

    private static final Map<Integer, Person> personStorage = new HashMap(){{
        Car car1 = new Car(1, "Passat");
        Car car2 = new Car(2, "Volvo");
        Car car3 = new Car(3, "Cadillac");
        Car car4 = new Car(4, "Laguna");
        Car car5 = new Car(5, "CLK");
        put(1, new Person(1, "Luke"));
        put(2, new Person(2, "Jake", Arrays.asList(car1)));
        put(3, new Person(3, "Charley", Arrays.asList(car2)));
        put(4, new Person(4, "Chris", Arrays.asList(car3, car4, car5)));
    }};

    @Override
    public Person getById(int id) {
        return Optional.ofNullable(personStorage.get(id))
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Person save(Person entity) {
        personStorage.put(entity.getId(), entity);
        return entity;
    }
}
