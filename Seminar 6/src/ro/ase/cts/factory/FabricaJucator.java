package ro.ase.cts.factory;

import ro.ase.cts.clase.Jucator;

public interface FabricaJucator {
	public Jucator creazaJucator(String nume, int nrTricou);
}
