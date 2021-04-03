package ro.ase.cts.builder.main;

import ro.ase.cts.builder.BuilderRezervare;
import ro.ase.cts.builder.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare(12, false, true, false, true, "rock");
		BuilderRezervare builderRezervare = new BuilderRezervare().setCodRezervare(1).setAreMancareInclusa(true).setAreMuzicaAmbientalaPersonalizata(true).setGenMuzical("Rock");
		Rezervare rezervare1 = builderRezervare.build();
		
		Rezervare rezervare2 = new BuilderRezervare().setCodRezervare(2).setAreBauturaRacoritoareInclusa(true).build();
		
		System.out.println(rezervare);
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		
		Rezervare rezervare4 = builderRezervare.setCodRezervare(4).build();
		
		BuilderRezervareV2 builderV2 = new BuilderRezervareV2().setAreMancareInclusa(true).setAreScaunErgonomic(true).setAreBauturaRacoritoareInclusa(true);
		Rezervare r1 = builderV2.setCodRezervare(10).build();
		Rezervare r2 = builderV2.setCodRezervare(11).build();
		
		System.out.println(r1);
		System.out.println(r2);
	}

}
