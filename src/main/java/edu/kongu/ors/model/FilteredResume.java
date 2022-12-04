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
@Table(name = "filtered_resume")
@NoArgsConstructor @AllArgsConstructor
@Getter @ToString
public class FilteredResume extends AbstractModel{

	@ManyToOne
	@JoinColumn(name = "resume_id")
	private Resume resume;

	@ManyToOne
	@JoinColumn(name = "job_post_id")
	private JobPost jobPost;
}
