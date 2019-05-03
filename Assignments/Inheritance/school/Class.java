package school;

public class Class {
	public Class() {

	}

	public double getGradeValue(String grade) {
		if(grade == "a") {
			return 4.0;
		} else if (grade == "b") {
			return 3.0;
		} else if (grade == "c") {
			return 2.0;
		} else if (grade == "d") {
			return 1.0;
		} else {
			return 0;
		}
	}
}