package ro.ase.cts.adapterObiecte.clase;

public class AdapterLeasing implements Creditable{

	private Leasing leasing;
	
	public AdapterLeasing(Leasing leasing) {
		this.leasing = leasing;
	}

	@Override
	public void crediteaza() {
		this.leasing.oferaLeasing();
	}
}
