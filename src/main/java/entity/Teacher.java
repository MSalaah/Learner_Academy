package entity;

public class Teacher {
	private String name;

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

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}
}