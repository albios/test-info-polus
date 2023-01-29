package com.example.testinfopolus.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.List;

@Data
@JsonSerialize
public class PersonDto {
    private int id;
    private String name;

    private List<CarDto> ownedCars;
}
