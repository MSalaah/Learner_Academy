package entity;

import java.io.Serializable;

public class Subject implements Serializable {
	
	private static final long serialVersionUID = -1520736715230378243L;
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
		return "Subject [name=" + name + "]";
	}
}
