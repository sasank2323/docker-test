package com.example.demo.Service;

import com.example.demo.Dto.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloWorldService {

    public List<PersonDTO> getAllPeople() {
        List<PersonDTO> people = new ArrayList<>();
        people.add(new PersonDTO("Alice", "alice@example.com", "1234567890", "Bangalore", "Engineer"));
        people.add(new PersonDTO("Bob", "bob@example.com", "2345678901", "Hyderabad", "Manager"));
        people.add(new PersonDTO("Charlie", "charlie@example.com", "3456789012", "Chennai", "Analyst"));
        people.add(new PersonDTO("David", "david@example.com", "4567890123", "Pune", "Developer"));
        people.add(new PersonDTO("Eva", "eva@example.com", "5678901234", "Delhi", "Tester"));
        people.add(new PersonDTO("Frank", "frank@example.com", "6789012345", "Mumbai", "Architect"));
        people.add(new PersonDTO("Grace", "grace@example.com", "7890123456", "Kolkata", "Consultant"));
        people.add(new PersonDTO("Henry", "henry@example.com", "8901234567", "Jaipur", "Designer"));
        people.add(new PersonDTO("Ivy", "ivy@example.com", "9012345678", "Noida", "Intern"));
        people.add(new PersonDTO("Jack", "jack@example.com", "0123456789", "Ahmedabad", "Lead"));

        return people;
    }
}