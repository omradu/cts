package program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeper zookeper;
	private List<Animal> animale;
	
	public Zoo() {
		this.zookeper = new Zookeper("Gigel");
		this.animale = new ArrayList<>();
	}

	public Zoo(Zookeper zookeper, List<Animal> animale) {
		this.zookeper = zookeper;
		this.animale = animale;
	}
	
	public void Add(Animal animal) {
		this.animale.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal a : animale) {
			zookeper.feed(a);
		}
	}
}
