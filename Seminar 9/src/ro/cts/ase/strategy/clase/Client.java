package ro.cts.ase.strategy.clase;
public class Client {
	private String numeClient;
	private Payable plata;
	
	public Client(String numeClient, Payable plata) {
		this.numeClient = numeClient;
		this.plata = plata;
	}
	
	public void setPlata(Payable plata) {
		this.plata = plata;
	}
	
	public void platesteNota(float suma) {
		System.out.println(numeClient + " are de realizta o plata ");
		this.plata.pay(suma);
	}
	
}
