package com.example.services;

import com.example.repositories.CandidateRepository;
import com.example.repositories.CandidateSkillRepository;
import com.example.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CandidateSkillService {
    CandidateSkillRepository repository;
    CandidateRepository candidateRepository;
    SkillRepository skillRepository;

    @Autowired
    public CandidateSkillService(CandidateSkillRepository repository, CandidateRepository candidateRepository, SkillRepository skillRepository) {
        this.repository = repository;
        this.candidateRepository = candidateRepository;
        this.skillRepository = skillRepository;
    }

}
