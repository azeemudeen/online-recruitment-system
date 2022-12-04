package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "skillset")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class Skillset extends AbstractModel{
	
	@Column(name = "skillset_name")
	private String skillSetName;
}
