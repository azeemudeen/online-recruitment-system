package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.FilteredResume;

@Repository
public interface FilteredResumeRepository extends JpaRepository<FilteredResume, Long> {

}
