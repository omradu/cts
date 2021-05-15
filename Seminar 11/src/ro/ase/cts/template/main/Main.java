package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		Spectator spectator1 = new Spectator("Marcel");
		SpectatorVIP spectator2 = new SpectatorVIP("Mircea", 7);
		
		spectator1.intraPeStadion();
		System.out.println("-----------------");
		spectator2.intraPeStadion();

	}

}
