package edu.kongu.ors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "user_type")
@NoArgsConstructor @AllArgsConstructor
@Getter @ToString
public class UserType extends AbstractModel{
	
	@Column(name = "type_name")
	private String typeName;

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	

}
