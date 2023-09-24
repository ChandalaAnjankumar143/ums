package org.ass.Hospital.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = Generationtype.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Integer age;
	private String address;
	@ManyToMany
	@JoinColumn
	List<Doctor>doctor;
	@OneToOne(mappedBy="person")
	MedicalHistory history;
}
