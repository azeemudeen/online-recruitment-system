package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.JobPost;

@Repository
public interface JobPostRepository extends JpaRepository<JobPost, Long>{

}
