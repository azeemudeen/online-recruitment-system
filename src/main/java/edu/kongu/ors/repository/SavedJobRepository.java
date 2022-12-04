package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.SavedJob;

@Repository
public interface SavedJobRepository extends JpaRepository<SavedJob, Long> {

}
