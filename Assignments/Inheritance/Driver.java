import java.util.List;
import java.util.ArrayList;
import school.*;

public class Driver {
	public static void main(String[] args) {
		Student s = new Student();

		s.addClass(new school.Class());
		s.addClass(new APClass());
		s.addClass(new APClass());
		s.addClass(new school.Class());
		s.addClass(new school.Class());
		s.addClass(new school.Class());

		System.out.println(s.getGPA());
	}
}