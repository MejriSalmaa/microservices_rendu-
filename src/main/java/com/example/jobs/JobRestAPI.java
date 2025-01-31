package com.example.jobs;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

public class JobRestAPI {

    @Autowired
    private jobsService jobService;
    @PostMapping("/add")
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }
    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Optional<Job> getJobById(@PathVariable Integer id) {
        return jobService.getJobById(id);
    }

    @GetMapping("/service/{service}")
    public List<Job> getJobsByService(@PathVariable String service) {
        return jobService.getJobsByService(service);
    }

    @PutMapping("/{id}/state")
    public Job updateJobState(@PathVariable Integer id, @RequestParam Boolean etat) {
        return jobService.updateJobState(id, etat);
    }
}