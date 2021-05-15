package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect{
	private String numeSala;

	public ManagerSala(String numeSala) {
		super();
		this.numeSala = numeSala;
	}
	
	public void anuntaMeci(String tipMeci) {
		String mesaj = this.numeSala + " va gazdui un meci de " + tipMeci;
		this.trimiteNotificare(mesaj);
	}
}
