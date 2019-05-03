package dogs;

public class SmallDog extends Dog {
	public SmallDog() {
		super();
	}

	@Override
	public void bark() {
		System.out.println("Yap!");
	}
}