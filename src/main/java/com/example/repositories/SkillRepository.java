package com.example.repositories;

import com.example.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SkillRepository extends JpaRepository<Skill, Long> {
}