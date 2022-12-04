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
@Table(name = "education")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class Education extends AbstractModel{
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "institution")
	private String institution;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
}
