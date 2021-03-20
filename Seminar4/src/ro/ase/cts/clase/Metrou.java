package ro.ase.cts.clase;

public class Metrou {
	private String denumireCompanie;
	private int nrStatii;
	private double pretCalatorie;
	
	private static Metrou metrou = null;
	
	public static synchronized Metrou getInstance(String denumireCompanie, int nrStatii, double pretCalatorie) {
		if(metrou == null) {
			metrou = new Metrou(denumireCompanie, nrStatii, pretCalatorie);
		}
		
		return metrou;
	}
	
	private Metrou() {
		this.denumireCompanie = "";
		this.nrStatii = 0;
		this.pretCalatorie = 0;
	}

	private Metrou(String denumireCompanie, int nrStatii, double pretCalatorie) {
		super();
		this.denumireCompanie = denumireCompanie;
		this.nrStatii = nrStatii;
		this.pretCalatorie = pretCalatorie;
	}

	public String getDenumireCompanie() {
		return denumireCompanie;
	}

	public void setDenumireCompanie(String denumireCompanie) {
		this.denumireCompanie = denumireCompanie;
	}

	public int getNrStatii() {
		return nrStatii;
	}

	public void setNrStatii(int nrStatii) {
		this.nrStatii = nrStatii;
	}

	public double getPretCalatorie() {
		return pretCalatorie;
	}

	public void setPretCalatorie(double pretCalatorie) {
		this.pretCalatorie = pretCalatorie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Metrou [denumireCompanie=");
		builder.append(denumireCompanie);
		builder.append(", nrStatii=");
		builder.append(nrStatii);
		builder.append(", pretCalatorie=");
		builder.append(pretCalatorie);
		builder.append("]");
		return builder.toString();
	}
	
	
}
