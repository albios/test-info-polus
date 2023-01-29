package com.example.testinfopolus.web;

import com.example.testinfopolus.dto.PersonDto;
import com.example.testinfopolus.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/people")
@Controller
public class PersonController {

    private final PersonService personService;

    @GetMapping("/{id}")
    public @ResponseBody
    PersonDto getPersonById(@PathVariable int id) {
        return personService.getPersonById(id);
    }

    @ResponseBody
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String personNotFoundExceptionResponse () {
        return "There's no person saved with given id";
    }

}
