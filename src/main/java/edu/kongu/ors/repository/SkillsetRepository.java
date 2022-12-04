package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.Skillset;

@Repository
public interface SkillsetRepository extends JpaRepository<Skillset, Long>{

}
