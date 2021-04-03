package ro.ase.cts.factory;

import ro.ase.cts.factory.clase.Jucator;
import ro.ase.cts.factory.clase.Portar;

public class FabricaPortar implements FabricaJucator {

	@Override
	public Jucator creazaJucator(String nume, int nrTricou) {
		return new Portar(nume,nrTricou);
	}

}
