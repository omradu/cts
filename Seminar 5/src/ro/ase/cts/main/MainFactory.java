package ro.ase.cts.main;

import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.FactorySingleton;
import ro.ase.cts.factory.PersonalMedical;
import ro.ase.cts.factory.TipPersonal;

public class MainFactory {

	public static void main(String[] args) {
		Factory factory = new Factory();
		
		PersonalMedical medic =  factory.create(TipPersonal.MEDIC, "Ionescu", 5000);
		PersonalMedical asistent = factory.create(TipPersonal.ASISTENT, "Popescu", 2000);
		
		System.out.println(medic);
		System.out.println(asistent);
		System.out.println("-------------------------");
		
		PersonalMedical medic2 = FactorySingleton.getInstance().create(TipPersonal.MEDIC, "Petrica", 12345);

        System.out.println(medic2);
	}
}
