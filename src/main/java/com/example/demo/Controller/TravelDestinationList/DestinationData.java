package com.example.demo.Controller.TravelDestinationList;

import com.example.demo.Dto.PersonDTO;
import com.example.demo.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/CICDCHECKING")
public class DestinationData {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public ResponseEntity<List<PersonDTO>> getPeople()
    {
        return new ResponseEntity<>(helloWorldService.getAllPeople(), HttpStatus.OK);

    }
}
