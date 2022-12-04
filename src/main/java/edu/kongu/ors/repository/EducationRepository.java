package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{

}
