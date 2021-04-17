package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.OperatorMese;
import ro.ase.cts.facade.clase.Picolo;

public class Main {

	public static void main(String[] args) {
		
		if(Facade.esteMasaPregatita(new Masa(30,4))) {
			System.out.println("Poftiti la masa domnule client");
		}else System.out.println("Va rog mai asteptati putin");
	}

}
