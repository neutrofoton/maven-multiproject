package io.github.neutrofoton.multimodule.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.neutrofoton.multimodule.domain.Person;
import io.github.neutrofoton.multimodule.service.PersonService;
import javax.annotation.Resource;
//import jakarta.annotation.Resource;

@RestController
@RequestMapping("/person")
public class PersonController {

    //@Resource(name = "personService")
    @Autowired
    PersonService personService;

    @GetMapping("/invokePerson")
    public Person getPerson(){
        return personService.getPerson();
    }
}
