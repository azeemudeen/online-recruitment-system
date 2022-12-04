package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long>{

}
