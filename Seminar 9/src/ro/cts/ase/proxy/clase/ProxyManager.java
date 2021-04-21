package ro.cts.ase.proxy.clase;

public class ProxyManager implements Rezervabil{
	private ManagerRezervari managerRezervari;
	private int nrMinimPersoane;

	public ProxyManager(ManagerRezervari managerRezervari,int nrMinimPersoane) {
		this.managerRezervari = managerRezervari;
		this.nrMinimPersoane = nrMinimPersoane;
	}

	@Override
	public void rezerva(int nrPersoane) {
		if(nrPersoane>=this.nrMinimPersoane) {
			this.managerRezervari.rezerva(nrPersoane);
		} else {
			System.out.print("Rezervarea nu se poate realiza, veniti fara rezervare");
		}
	}

}
