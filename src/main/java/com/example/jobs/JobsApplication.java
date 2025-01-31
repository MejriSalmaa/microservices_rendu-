package com.example.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobsApplication.class, args);
    }
@Autowired
private JobsRepository repository;
@Bean
ApplicationRunner init() {
    return (args) -> {
// save
//        repository.save(new Job( "Java Developer", false));
//        repository.save(new Job( "Python Developer", true));
//        repository.save(new Job( "C++ Developer", false));
//        repository.save(new Job( "C# Developer", true));
// fetch
        repository.findAll().forEach(System.out::println);
    };}
}
