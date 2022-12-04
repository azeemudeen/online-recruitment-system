package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "job_post_skillset")
@NoArgsConstructor @AllArgsConstructor
@Getter @ToString
public class JobPostSkillset extends AbstractModel{
	
	@ManyToOne
	@JoinColumn(name = "skillset_id")
	private Skillset skillSet;

	@ManyToOne
	@JoinColumn(name = "job_post_id")
	private JobPostSkillset jobSkillSet;
	
	@Column(name = "skill_level")
	private int skillLevel;
}
