package com.example.services;

import com.example.repositories.ExperiencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperiencesService {
    @Autowired
    ExperiencesRepository repository;

}
