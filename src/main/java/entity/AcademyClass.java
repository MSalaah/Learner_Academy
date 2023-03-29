package entity;

public class AcademyClass {
	
	private String name;

	public AcademyClass() {
		// TODO Auto-generated constructor stub
	}

	public AcademyClass(String name) {
		super();
		this.name = name;
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
