package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class AngajatiReader extends Readable {

	public AngajatiReader(String fileName) {
		super(fileName);
		
	}

	@Override
	public List<Aplicant> readAplicant() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.fileName));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Angajat angajat = new Angajat();
			super.citesteAplicant(input2, angajat);
			
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			
			angajati.add(angajat);
		}
		input2.close();
		return angajati;
	}
}
