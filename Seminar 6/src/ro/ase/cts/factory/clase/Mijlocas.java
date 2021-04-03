package ro.ase.cts.factory.clase;

public class Mijlocas extends Jucator{

	public Mijlocas(String nume, int nrTricou) {
		super(nume, nrTricou);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mijlocas [getNume()=");
		builder.append(getNume());
		builder.append(", getNrTricou()=");
		builder.append(getNrTricou());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	

}
