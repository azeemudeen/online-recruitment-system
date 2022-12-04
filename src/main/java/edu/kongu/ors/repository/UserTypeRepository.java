package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long>{

}
