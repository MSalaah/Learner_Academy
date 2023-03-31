package entity;

import java.io.Serializable;
import java.util.List;

public class AcademyClass implements Serializable {

	private static final long serialVersionUID = -6143431480653781556L;
	private int id;
	private String name;
	private Subject subject;
	private Teacher teacher;
	private List<Student> students;
	
	public AcademyClass() {
		// TODO Auto-generated constructor stub
	}

	public AcademyClass(String name) {
		super();
		this.name = name;
	}
	
	public AcademyClass(String name, Subject subject, Teacher teacher) {
		super();
		this.name = name;
		this.subject = subject; 
		this.teacher = teacher;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AcademyClass [name=" + name + "]";
	}
}
