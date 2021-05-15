package ro.ase.cts.template.clase;

public class Spectator extends Template{

	private String numeSpectator;
	
	public Spectator(String numeSpectator) {
		super();
		this.numeSpectator = numeSpectator;
	}

	@Override
	public void seAseazaLaCoada() {
		System.out.println(this.numeSpectator + " se aseaza la coada");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(this.numeSpectator + " prezinta bilet");
	}

	@Override
	public void seFaceControlCorporal() {
		System.out.println(this.numeSpectator + " a efectuat controlul corporal");
	}

	@Override
	public void seOcupaLoc() {
		System.out.println(this.numeSpectator + " ocupa loc la tribuna");
	}

}
