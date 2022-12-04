package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>{

}
