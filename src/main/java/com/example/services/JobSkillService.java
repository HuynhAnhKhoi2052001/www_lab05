package com.example.services;

import com.example.repositories.JobRepository;
import com.example.repositories.JobSkillRepository;
import com.example.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class JobSkillService {
    private final JobSkillRepository repository;
    private final JobRepository jobRepository;
    private final SkillRepository skillRepository;

    @Autowired
    public JobSkillService(JobSkillRepository repository, JobRepository jobRepository, SkillRepository skillRepository) {
        this.repository = repository;
        this.jobRepository = jobRepository;
        this.skillRepository = skillRepository;
    }

}
