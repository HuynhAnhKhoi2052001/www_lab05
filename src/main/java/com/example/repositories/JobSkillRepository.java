package com.example.repositories;

import com.example.ids.JobSkillID;
import com.example.models.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillID> {
}