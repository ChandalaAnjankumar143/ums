package org.ass.Hospital.entity;

@Entity
@Data
public class MedicalHistory {
	@Id
	@GeneratedValu(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "patient_name")
	private String patientName;
@OneToOne
@JoinColumn
@Column(nullable=false)
private Person person;
@OneToMany
private List<MedicalObservation> observations;
}
