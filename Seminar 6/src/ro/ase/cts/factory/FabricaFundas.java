package ro.ase.cts.factory;

import ro.ase.cts.clase.Fundas;
import ro.ase.cts.clase.Jucator;

public class FabricaFundas implements FabricaJucator{

	@Override
	public Jucator creazaJucator(String nume, int nrTricou) {
		return new Fundas(nume,nrTricou);
	}

}
