package com.raven.template.controller;


import com.raven.template.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Person getPerson() {
        return new Person("ala", 2);
    }

}
