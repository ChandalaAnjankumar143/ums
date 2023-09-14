package Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="course_info")
public class Course implements Serializable{
	@Id
	@GenericGenerator(name = "auto_up", strategy = "increment")
	@GeneratedValue(generator ="auto_up" )
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="credits")
	private String credits;
	
	@ManyToMany
	@JoinColumn
	private List<Student> students;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public List<Student> getStudent() {
		return students;
	}
	public void setStudent(List<Student> students) {
		this.students = students;
	}
}
