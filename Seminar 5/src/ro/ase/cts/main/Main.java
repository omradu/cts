package ro.ase.cts.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.prototype.Reteta;

public class Main {

	public static void main(String[] args) {
		
		List<String> solutii = new ArrayList<>();
		solutii.add("Apa");
		
		List<Integer> cantitati = new ArrayList<>();
		cantitati.add(10);
		
		Reteta reteta1 = new Reteta(solutii, cantitati);
		Reteta reteta2 = (Reteta) reteta1.copiaza();
		
		System.out.println(reteta1.toString());
		System.out.println(reteta2.toString());

	}

}
