package entity;

public class Student {

	private String name;
	private AcademyClass course;
	private int age;

	public AcademyClass getCourse() {
		return course;
	}

	public void setCourse(AcademyClass course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, AcademyClass course, int age) {
		super();
		this.name = name;
		this.course = course;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
