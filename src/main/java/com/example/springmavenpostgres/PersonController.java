package com.example.springmavenpostgres;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    private final PersonService personService;

    PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/add")
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        Person savedPerson = personService.savePerson(person);
        return ResponseEntity.ok().body(savedPerson);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAll() {

        List<Person> allPerson = personService.getAllPerson();
        return ResponseEntity.ok(allPerson);
    }

    @GetMapping("/native/all")
    public ResponseEntity<List<Person>> getAllNative() {
        List<Person> allPerson = personService.getAllPersonAsNativeQuery();
        return ResponseEntity.ok(allPerson);
    }
    @GetMapping("/byAge/{age}")
    public ResponseEntity<List<Person>> getByAge(@PathVariable int age) {
        List<Person> allPerson = personService.getByAgeAfter(age);
        return ResponseEntity.ok(allPerson);
    }
    @GetMapping("/native/byAge/{age}")
    public ResponseEntity<List<Person>> getByAgeNative(@PathVariable int age) {
        List<Person> allPerson = personService.getByAgeNative(age);
        return ResponseEntity.ok(allPerson);
    }
}
