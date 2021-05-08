package ro.cts.ase.chainOfResponsability.main;

import ro.cts.ase.chainOfResponsability.clase.Cont;
import ro.cts.ase.chainOfResponsability.clase.ContCredit;
import ro.cts.ase.chainOfResponsability.clase.ContCurent;
import ro.cts.ase.chainOfResponsability.clase.ContEconomii;

public class Main {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(200);
		Cont contCredit = new ContCredit(150);
		Cont contEconomii = new ContEconomii(150);
		
		contCurent.setSuccesorCont(contCredit);
		contCredit.setSuccesorCont(contEconomii);
		
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(150);
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(100);
	}

}
