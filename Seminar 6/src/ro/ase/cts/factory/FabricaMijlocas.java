package ro.ase.cts.factory;

import ro.ase.cts.factory.clase.Jucator;
import ro.ase.cts.factory.clase.Mijlocas;

public class FabricaMijlocas implements FabricaJucator{

	@Override
	public Jucator creazaJucator(String nume, int nrTricou) {
		return new Mijlocas(nume,nrTricou);
	}

}
