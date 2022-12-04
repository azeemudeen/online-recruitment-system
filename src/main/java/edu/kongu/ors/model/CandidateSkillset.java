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
@Table(name = "candidate_skillset")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class CandidateSkillset extends AbstractModel{
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@ManyToOne
	@JoinColumn(name = "skillset_id")
	private Candidate skillSet;
	
	@ManyToOne
	@JoinColumn(name = "skill_level")
	private Candidate skillLevel;
	
}
