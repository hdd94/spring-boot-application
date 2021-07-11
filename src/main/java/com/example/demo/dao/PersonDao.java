package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDao {

    // Einfügen eines Objekts zum Persistent Object
    // Entweder selber ein Objekt hinzufügen
    int insertPerson(UUID id, Person person);

    // Oder ein vorhandenes Objekt
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
}
