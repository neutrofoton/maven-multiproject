package io.github.neutrofoton.multimodule.service;


import org.springframework.stereotype.Service;
import io.github.neutrofoton.multimodule.domain.Person;

//@Service("personService")
@Service
public class PersonServiceImpl implements PersonService{

    @Override
    public Person getPerson() {
        return new Person("kid", 9);
    }
    
}
