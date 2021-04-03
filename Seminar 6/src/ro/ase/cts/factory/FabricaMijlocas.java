package ro.ase.cts.factory;

import ro.ase.cts.clase.Jucator;
import ro.ase.cts.clase.Mijlocas;

public class FabricaMijlocas implements FabricaJucator{

	@Override
	public Jucator creazaJucator(String nume, int nrTricou) {
		return new Mijlocas(nume,nrTricou);
	}

}
