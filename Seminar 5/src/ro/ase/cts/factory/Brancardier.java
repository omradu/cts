package ro.ase.cts.factory;

public class Brancardier extends PersonalMedical{

	public Brancardier(String nume, float salariu) {
		super(nume, salariu);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}

}
