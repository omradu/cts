package ro.cts.ase.command.clase;

public class ComandaDepundere extends ComandaAbstracta {

	public ComandaDepundere(Executant executant, float suma) {
		super(executant, suma);
	}

	@Override
	public void executa() {
		super.getExecutant().depunere(super.getSuma());
	}

}
