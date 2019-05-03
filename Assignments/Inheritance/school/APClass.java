package school;

public class APClass extends Class {
	public APClass() {
		super();
	}

	@Override
	public double getGradeValue(String grade) {
		if(grade == "a") {
			return 5.0;
		} else if (grade == "b") {
			return 4.0;
		} else if (grade == "c") {
			return 3.0;
		} else if (grade == "d") {
			return 1.0;
		} else {
			return 0;
		}
	}
}