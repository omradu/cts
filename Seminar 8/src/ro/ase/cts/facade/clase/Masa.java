package ro.ase.cts.facade.clase;

public class Masa {
	private int nrMasa;
	private int nrLocuri;
	
	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}



	public int getNrLocuri() {
		return nrLocuri;
	}

	public void setNrLocuri(int nrLocuri) {
		this.nrLocuri = nrLocuri;
	}

	public Masa(int nrMasa, int nrLocuri) {
		super();
		this.nrMasa = nrMasa;
		this.nrLocuri = nrLocuri;
	}
	
}
