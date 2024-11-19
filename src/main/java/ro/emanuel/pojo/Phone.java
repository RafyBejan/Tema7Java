package ro.emanuel.pojo;

public class Phone {

	private int id;
	private String name;
	

	
	public Phone(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Phone(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}