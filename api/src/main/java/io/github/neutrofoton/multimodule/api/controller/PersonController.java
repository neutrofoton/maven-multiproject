package io.github.neutrofoton.multimodule.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.neutrofoton.multimodule.domain.Person;
import io.github.neutrofoton.multimodule.service.PersonService;
import javax.annotation.Resource;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource(name = "personService")
    PersonService personService;

    @GetMapping("/invokePerson")
    public Person getPerson(){
        return personService.getPerson();
    }
}
