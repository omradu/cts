package ro.ase.cts.template.clase;

public class SpectatorVIP extends Template{
	
	private String nume;
	private int nrLoja;
	
	public SpectatorVIP(String nume, int nrLoja) {
		super();
		this.nume = nume;
		this.nrLoja = nrLoja;
	}

	@Override
	public void seAseazaLaCoada() {
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(this.nume + " prezinta bilet VIP");
		
	}

	@Override
	public void seFaceControlCorporal() {
		System.out.println(this.nume + " a efectuat controlul corporal");
		
	}

	@Override
	public void seOcupaLoc() {
		System.out.println(this.nume + " se aseaza in loja " + this.nrLoja);
		
	}

}
