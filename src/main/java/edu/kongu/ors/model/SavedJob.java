package edu.kongu.ors.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "saved_job")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class SavedJob extends AbstractModel{
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@ManyToOne
	@JoinColumn(name = "job_post_id")
	private JobPost jobPost;
	
}
