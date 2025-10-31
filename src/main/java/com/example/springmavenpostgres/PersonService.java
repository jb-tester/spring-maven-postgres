package com.example.springmavenpostgres;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public Person savePerson(Person person) {
         personRepository.save(person);
         return person;
    }
    public List<Person> getAllPerson() {
        Iterable<Person> all = personRepository.findAll();
        return (List<Person>) all;
    }
    public List<Person> getAllPersonAsNativeQuery() {
        List<Person> all = personRepository.allPersonsNativeQuery();
        return all;
    }
    public List<Person> getByAgeAfter(int age) {
        List<Person> all = personRepository.allByAgeAfter(age);
        return all;
    }
    public List<Person> getByAgeNative(int age) {
        List<Person> all = personRepository.allByAgeAfterNative(age);
        return all;
    }
}
