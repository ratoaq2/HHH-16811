package org.hibernate.bugs;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class MyEmbeddableComponent {

	@Column(name = "MY_EMB_REF")
	String embRef;

	@ManyToOne
	@JoinColumn(name = "ENTITY_C")
	@Fetch(FetchMode.SELECT)
	EntityC entityC;
}
