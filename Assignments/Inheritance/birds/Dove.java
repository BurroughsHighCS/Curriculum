package birds;

public class Dove extends Bird {
	public Dove() {
		super();
	}

	public void act() {
		super.act();
		System.out.print("waddle ");
	}

	public void makeNoise() {
		super.makeNoise();
		System.out.print("coo ");
	}
}