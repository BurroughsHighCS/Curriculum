import java.util.List;
import java.util.ArrayList;

public class Recursion {
	public static List<Long> fibs;
	public static long count = 0;

	public static void main(String[] args) {
		fibs = new ArrayList<Long>();
		fibs.add(0l);
		fibs.add(1l);

		System.out.println(fibonacci(82));

		for(long l : fibs) {
			System.out.println(l);
		}
	}

	public static long fibonacci(int n) {
		if(fibs.size() > n) {
			return fibs.get(n);
		}
		else {
			long result = fibonacci(n-1) + fibonacci(n-2); 											
			fibs.add(result);
			return result;
		}

	}
}