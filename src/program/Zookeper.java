package program;

public class Zookeper {
	private String name;

	public Zookeper(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void feed(Animal animal) {
		System.out.println(this.getName() + " hraneste animalul " + animal.getName());
	}

}
