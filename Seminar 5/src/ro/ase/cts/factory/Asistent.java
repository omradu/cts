package ro.ase.cts.factory;

public class Asistent extends PersonalMedical {

	private int nrOreLucrate;
	
	public Asistent(String nume, float salariu, int nrOreLucrate) {
		super(nume, salariu);
		this.nrOreLucrate = nrOreLucrate;
	}
	

	public void setNrOreLucrate(int nrOreLucrate) {
		this.nrOreLucrate = nrOreLucrate;
	}


	public Asistent(String nume, float salariu) {
		super(nume, salariu);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent [toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}

	
}
