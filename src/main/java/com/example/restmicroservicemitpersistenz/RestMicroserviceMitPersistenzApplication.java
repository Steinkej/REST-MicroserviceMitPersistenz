package com.example.restmicroservicemitpersistenz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class restmicroservicemitpersistenz {

    public static void main(String[] args) {

        SpringApplication.run(restmicroservicemitpersistenz.class, args);
    }

    @GetMapping("/students")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format(" Hallo %s! Schön, dass du da bist!", name);
    }

    @GetMapping("/hello")
    public String viewStudents() {
        return null;
    }



}