package edu.kongu.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kongu.ors.model.NotificationLog;

@Repository
public interface NotificationLogRepository extends JpaRepository<NotificationLog, Long> {

}
