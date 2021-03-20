package ro.ase.cts.clase;

public class Parlament {
	
	private String tara;
	private int nrParlamentari;
	private int durataMandat;
	private String denumireSediu;
	
	//eager initialization - se apeleaza la declarare constructorul
	private static Parlament parlament = new Parlament();
	
	public static Parlament getInstance() {
		return parlament;
	}
	
	private Parlament() {
		this.tara = "";
		this.nrParlamentari = 0;
		this.durataMandat = 0;
		this.denumireSediu = "";
	}
	
	private Parlament(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
		super();
		this.tara = tara;
		this.nrParlamentari = nrParlamentari;
		this.durataMandat = durataMandat;
		this.denumireSediu = denumireSediu;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}

	public int getNrParlamentari() {
		return nrParlamentari;
	}

	public void setNrParlamentari(int nrParlamentari) {
		this.nrParlamentari = nrParlamentari;
	}

	public int getDurataMandat() {
		return durataMandat;
	}

	public void setDurataMandat(int durataMandat) {
		this.durataMandat = durataMandat;
	}

	public String getDenumireSediu() {
		return denumireSediu;
	}

	public void setDenumireSediu(String denumireSediu) {
		this.denumireSediu = denumireSediu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parlament [tara=");
		builder.append(tara);
		builder.append(", nrParlamentari=");
		builder.append(nrParlamentari);
		builder.append(", durataMandat=");
		builder.append(durataMandat);
		builder.append(", denumireSediu=");
		builder.append(denumireSediu);
		builder.append("]");
		return builder.toString();
	}
	
	
}
