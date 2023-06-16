package org.hibernate.bugs;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENTITY_B")
public class EntityB {
	@Id
	@Column(name = "ID")
	Integer id;

	@OneToMany(mappedBy = "entityB")
	final List<EntityA> listOfEntityA = new ArrayList<>();
}
