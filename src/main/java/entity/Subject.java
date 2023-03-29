package entity;

public class Subject {
	
	private String name;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(String name) {
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
		return "Customer [name=" + name + "]";
	}
}