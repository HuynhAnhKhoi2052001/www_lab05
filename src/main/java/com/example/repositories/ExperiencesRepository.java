package com.example.repositories;

import com.example.models.Experiences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExperiencesRepository extends JpaRepository<Experiences, Long> {
}