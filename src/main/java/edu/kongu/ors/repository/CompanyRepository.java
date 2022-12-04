package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
