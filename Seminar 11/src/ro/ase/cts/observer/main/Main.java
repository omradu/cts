package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ManagerSala managerSala = new ManagerSala("Sala polivalenta");
		
		ClientAbonat client1 = new ClientAbonat("Popescu");
		ClientAbonat client2 = new ClientAbonat("Georgescu");
		
		managerSala.adaugaAbonat(client1);
		managerSala.adaugaAbonat(client2);
		
		managerSala.anuntaMeci("handbal");
		System.out.println("--------------------");
		
		managerSala.stergeAbonat(client2);
		managerSala.anuntaMeci("fotbal");

	}

}
