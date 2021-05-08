package ro.cts.ase.command.main;

import ro.cts.ase.command.clase.ComandaCreare;
import ro.cts.ase.command.clase.ComandaDepundere;
import ro.cts.ase.command.clase.ComandaRetragere;
import ro.cts.ase.command.clase.Executant;
import ro.cts.ase.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		
		Executant cont = new Executant("Gigel");
		
		ComandaCreare comandaCreare = new ComandaCreare(cont, 1000);
		managerComenzi.adaugaComanda(comandaCreare);
		managerComenzi.adaugaComanda(new ComandaRetragere(cont,123));
		
		managerComenzi.executaComanda();
		
		managerComenzi.adaugaComanda(new ComandaDepundere(cont, 1234));
		managerComenzi.adaugaComanda(new ComandaRetragere(cont, 2200));
		
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}
