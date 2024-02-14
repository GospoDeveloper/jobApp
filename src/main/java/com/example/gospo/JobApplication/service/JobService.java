package com.example.gospo.JobApplication.service;

import com.example.gospo.JobApplication.model.JobPost;
import com.example.gospo.JobApplication.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJobPost(jobPost);

    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

}
