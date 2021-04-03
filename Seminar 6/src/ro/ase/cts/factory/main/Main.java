package ro.ase.cts.factory.main;

import ro.ase.cts.factory.FabricaAtacant;
import ro.ase.cts.factory.FabricaJucator;
import ro.ase.cts.factory.FabricaMijlocas;
import ro.ase.cts.factory.FabricaPortar;
import ro.ase.cts.factory.clase.Jucator;

public class Main {
	
	public static void afiseazaInformatiiJucator(FabricaJucator fabrica, String nume, int nrTricou) {
		Jucator jucator = fabrica.creazaJucator(nume, nrTricou);
		System.out.println(jucator.toString());
	}

	public static void main(String[] args) {
		afiseazaInformatiiJucator(new FabricaAtacant(), "Popescu", 15);
		afiseazaInformatiiJucator(new FabricaPortar(), "Ionescu", 17);
		afiseazaInformatiiJucator(new FabricaMijlocas(), "Georgescu", 11);
	}

}
