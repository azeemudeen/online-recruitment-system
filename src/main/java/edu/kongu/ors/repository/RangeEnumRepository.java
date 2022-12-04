package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.RangeEnum;

@Repository
public interface RangeEnumRepository extends JpaRepository<RangeEnum, Long>{

}
