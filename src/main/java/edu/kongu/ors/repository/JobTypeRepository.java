package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.JobType;

@Repository
public interface JobTypeRepository extends JpaRepository<JobType, Long> {

}
