package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "range_enum")
@NoArgsConstructor @AllArgsConstructor 
@Getter @ToString
public class RangeEnum extends AbstractModel {
	
	@Column(name = "start_range")
	private int startRange;
	
	@Column(name = "end_range")
	private int endRange;
}
