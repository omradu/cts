package ro.ase.cts.builder.clase;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacoritoareInclusa;
	private boolean areMuzicaAmbientalaPersonalizata;
	private String genMuzical;
	
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic,
			boolean areBauturaRacoritoareInclusa, boolean areMuzicaAmbientalaPersonalizata, String genMuzical) {
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		this.genMuzical = genMuzical;
	}

	public int getCodRezervare() {
		return codRezervare;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	public boolean isAreMancareInclusa() {
		return areMancareInclusa;
	}

	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}

	public boolean isAreScaunErgonomic() {
		return areScaunErgonomic;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public boolean isAreBauturaRacoritoareInclusa() {
		return areBauturaRacoritoareInclusa;
	}

	public void setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
		this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
	}

	public boolean isAreMuzicaAmbientalaPersonalizata() {
		return areMuzicaAmbientalaPersonalizata;
	}

	public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
	}

	public String getGenMuzical() {
		return genMuzical;
	}

	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=");
		builder.append(codRezervare);
		builder.append(", areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areBauturaRacoritoareInclusa=");
		builder.append(areBauturaRacoritoareInclusa);
		builder.append(", areMuzicaAmbientalaPersonalizata=");
		builder.append(areMuzicaAmbientalaPersonalizata);
		builder.append(", genMuzical=");
		builder.append(genMuzical);
		builder.append("]");
		return builder.toString();
	}
	
	
}
