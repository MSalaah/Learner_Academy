package entity;

import java.util.List;

public class AcademyClass {

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
