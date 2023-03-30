package entity;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	
	private String name;

    private List<AcademyClass> courses =  new ArrayList<AcademyClass>();

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

    public void addCourse(AcademyClass course) {
        courses.add(course);
    }
    

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}
}
