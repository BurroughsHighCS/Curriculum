package birds;

public class Bird {
	public Bird() {

	}

	public void act() {
		System.out.print("fly ");
		makeNoise();
	}

	public void makeNoise() {
		System.out.print("chirp ");
	}
}