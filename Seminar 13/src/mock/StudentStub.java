package mock;

import java.util.List;

import clase.IStudent;

public class StudentStub implements IStudent{

	@Override
	public String getNume() {
		return "Gigel";
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return 8;
	}

	@Override
	public int getNota(int index) {
		return 9;
	}

	@Override
	public boolean areRestante() {
		return true;
	}

}
