package ro.ase.cts.factory;

public abstract class PersonalMedical {
	private String nume;
	private float salariu;
	
	public PersonalMedical(String nume, float salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
	}

	public PersonalMedical() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonalMedical [nume=");
		builder.append(nume);
		builder.append(", salariu=");
		builder.append(salariu);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
