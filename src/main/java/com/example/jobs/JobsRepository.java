package com.example.jobs;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobsRepository extends JpaRepository<Job,Integer> {

    List<Job> findByService(String service);


}
