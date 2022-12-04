package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
