package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "job_post")
@AllArgsConstructor @Getter
public class JobPost extends AbstractModel{

	@Column(name = "job_title")
	private String jobTitle;
	
	@ManyToOne
	@JoinColumn(name = "job_type_id")
	private JobType jobType;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "job_location")
	private String jobLocation;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

}
