package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.Recruiter;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {

}
