package edu.kongu.ors.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "experience")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class Experience extends AbstractModel{
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "is_current_job")
	private boolean isCurrentJob;
}
