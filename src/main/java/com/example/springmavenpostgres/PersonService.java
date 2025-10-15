package com.example.springmavenpostgres;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPerson() {
        Iterable<Person> all = personRepository.findAll();
        return (List<Person>) all;
    }
}
