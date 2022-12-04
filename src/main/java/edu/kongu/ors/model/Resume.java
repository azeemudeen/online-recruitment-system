package edu.kongu.ors.model;

import java.sql.Date;

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
@Table(name = "resume")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class Resume extends AbstractModel{
	
	@Column(name = "resume_title")
	private String resumeTitle;
	
	@Column(name = "file_path")
	private String filePath;

	@Column(name = "dob")
	private Date DOB;

	@Column(name = "age")
	private int age;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
}
