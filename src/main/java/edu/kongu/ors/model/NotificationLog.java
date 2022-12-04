package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "notification_log")
@AllArgsConstructor @Getter
public class NotificationLog extends AbstractModel{
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

	@Column(name = "notification_type")
	private int notificationType;
	
	@Column(name = "status")
	private boolean status;
}
