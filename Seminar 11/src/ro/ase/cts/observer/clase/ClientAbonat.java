package ro.ase.cts.observer.clase;

public class ClientAbonat implements Observer {
	private String numeClient;
	
	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}

	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println("Clientul " + this.numeClient + " a rceptionat mesajul " + mesaj);
		
	}
	
}
