package org.ass.Hospital.entity;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy=Generationtype.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String specialization;
	private Boolean available;
	@ManyToMany(mappedBy="doctor")
	List<Person> person;
}
