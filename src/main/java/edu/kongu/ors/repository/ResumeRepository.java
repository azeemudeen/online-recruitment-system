package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
