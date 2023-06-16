package org.hibernate.bugs;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// initial investigation started with dynamic update since there were other dirty properties
// but this minimal test case also fails without dynamic update since myEmbeddable is the only dirty property in this test case
@org.hibernate.annotations.DynamicUpdate
@Entity
@Table(name = "ENTITY_A")
public class EntityA {
	@Id
	@Column(name = "ID")
	Integer id;

	@Embedded
	MyEmbeddableComponent myEmbeddable;

	@JoinColumn(name = "ENTITY_B")
	@ManyToOne
	EntityB entityB;
}