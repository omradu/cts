package ro.cts.ase.state.main;

import ro.cts.ase.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa1 = new Masa(1);
		masa1.cerereEliberare();
		masa1.cerereRezervare();
		masa1.cerereOcupare();
		masa1.cerereRezervare();
		masa1.cerereEliberare();
	}

}
