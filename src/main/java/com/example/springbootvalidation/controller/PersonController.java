package com.example.springbootvalidation.controller;

import com.example.springbootvalidation.domain.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {

    @PostMapping("/person/save")
    public Person save(@Valid @RequestBody Person person) {

        return person;
    }


}








































