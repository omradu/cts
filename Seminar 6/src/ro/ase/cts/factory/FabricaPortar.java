package ro.ase.cts.factory;

import ro.ase.cts.clase.Jucator;
import ro.ase.cts.clase.Portar;

public class FabricaPortar implements FabricaJucator {

	@Override
	public Jucator creazaJucator(String nume, int nrTricou) {
		return new Portar(nume,nrTricou);
	}

}
