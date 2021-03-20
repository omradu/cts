package ro.ase.cts.main;

import ro.ase.cts.clase.Metrou;
import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;

public class Main {

	public static void main(String[] args) {
		Parlament parlament1 = Parlament.getInstance();
		Parlament parlament2 = Parlament.getInstance();
		
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		System.out.println("-----------------------");
		
		parlament1.setTara("Romania");
		parlament2.setNrParlamentari(300);
		
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		System.out.println("-----------------------");

		ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia", 400, 8, "Sediul Serbiei");
		ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK", 500, 2, "Sediul UK");
		
		System.out.println(parlamentLazy1.toString());
		System.out.println(parlamentLazy2.toString());
		System.out.println("-----------------------");
		
		Metrou metrou1 = Metrou.getInstance("Metrorex", 176, 2.5);
		Metrou metrou2 = Metrou.getInstance("Metro", 100, 2);
		
		System.out.println(metrou1.toString());
		System.out.println(metrou2.toString());
		System.out.println("-----------------------");
	}

}
