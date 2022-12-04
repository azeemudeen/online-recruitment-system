package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "job_type")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class JobType extends AbstractModel {
	
	@Column(name = "type_name")
	private String typeName;
}
