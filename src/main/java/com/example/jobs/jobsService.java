package com.example.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class jobsService {

    @Autowired
    private JobsRepository jobsRepository;
    public Job addJob(Job job) {
        return jobsRepository.save(job);
    }
    public List<Job> getAllJobs() {
        return jobsRepository.findAll();
    }

    public Optional<Job> getJobById(Integer id) {
        return jobsRepository.findById(id);
    }

    public List<Job> getJobsByService(String service) {
        return jobsRepository.findByService(service);
    }

    public Job updateJobState(Integer id, Boolean etat) {
        Optional<Job> jobOptional = jobsRepository.findById(id);
        if (jobOptional.isPresent()) {
            Job job = jobOptional.get();
            job.setEtat(etat);
            return jobsRepository.save(job);
        }
        return null;
    }
}
