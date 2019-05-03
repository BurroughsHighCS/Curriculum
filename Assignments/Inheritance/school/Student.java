package school;

import java.util.List;
import java.util.ArrayList;

public class Student {
	private List<Class> classes;
	private String name;

	public Student() {
		classes = new ArrayList<Class>();

	}

	public void addClass(Class c) {
		this.classes.add(c);
	}

	public double getGPA() {
		double totalGrade = 0;
		for(Class c : classes) {
			totalGrade += c.getGradeValue("a");
		}

		return totalGrade / classes.size();
	}
}