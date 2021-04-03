package ro.ase.cts.factory;

import ro.ase.cts.factory.clase.Atacant;
import ro.ase.cts.factory.clase.Jucator;

public class FabricaAtacant implements FabricaJucator{

	@Override
	public Jucator creazaJucator(String nume, int nrTricou) {
		return new Atacant(nume,nrTricou);
	}

}
