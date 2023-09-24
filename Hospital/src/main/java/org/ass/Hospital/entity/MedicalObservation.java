package org.ass.Hospital.entity;

import java.util.List;

@Data
@Entity
@Table(name="medical_observation")
public class MedicalObservation {
private Integer id;
private String encounter;
@OneToMany
private List<Doctor> doctors;
@ManyToOne
@Column(nullable=false)
private MedicalHistory history;
}
//save,update,delete,fetch