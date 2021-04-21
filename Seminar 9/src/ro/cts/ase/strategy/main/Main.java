package ro.cts.ase.strategy.main;

import ro.cts.ase.strategy.clase.PlataCard;
import ro.cts.ase.strategy.clase.PlataCash;
import ro.cts.ase.strategy.clase.Client;
import ro.cts.ase.strategy.clase.PlataBonuriMasa;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Ionel", new PlataCash());
		client.platesteNota(200);
		client.setPlata(new PlataCard());
		client.platesteNota((float) 100.3);
		client.setPlata(new PlataBonuriMasa());
		client.platesteNota(1050);
	}

}
