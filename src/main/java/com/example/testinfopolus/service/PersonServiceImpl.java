package com.example.testinfopolus.service;

import com.example.testinfopolus.dao.PersonRepository;
import com.example.testinfopolus.domain.Car;
import com.example.testinfopolus.domain.Person;
import com.example.testinfopolus.dto.CarDto;
import com.example.testinfopolus.dto.PersonDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonDto getPersonById(int id) {
        return mapPersonToDto(personRepository.getById(id));
    }

    private PersonDto mapPersonToDto (Person entity) {
        PersonDto dto = new PersonDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setOwnedCars(entity.getOwnedCars().stream().map(this::mapCarToDto).collect(Collectors.toList()));
        return dto;
    }

    private CarDto mapCarToDto(Car entity) {
        return new CarDto(entity.getId(), entity.getName());
    }
}
