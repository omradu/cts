package ro.cts.ase.proxy.main;

import ro.cts.ase.proxy.clase.ManagerRezervari;
import ro.cts.ase.proxy.clase.ProxyManager;

public class Main {

	public static void main(String[] args) {
		ManagerRezervari managerRezervari = new ManagerRezervari("Andromeda");
		managerRezervari.rezerva(2);
		ProxyManager proxyManager = new ProxyManager(managerRezervari,4);
		proxyManager.rezerva(2);
		proxyManager.rezerva(4);
	}

}
