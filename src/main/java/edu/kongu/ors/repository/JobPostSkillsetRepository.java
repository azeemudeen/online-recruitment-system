package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.JobPostSkillset;

@Repository
public interface JobPostSkillsetRepository extends JpaRepository<JobPostSkillset, Long> {

}
