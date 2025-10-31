package com.example.springmavenpostgres;

import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> queryAllByAgeAfter(int ageAfter);

    @Query("select p from Person p where p.age > :age")
    List<Person> allByAgeAfter(@Param("age") int age);

    @Query(value = "select * from persons1 where age > :age", nativeQuery = true)
    List<Person> allByAgeAfterNative(@Param("age") int age);

    @NativeQuery("select * from persons1")
    List<Person> allPersonsNativeQuery();


}
