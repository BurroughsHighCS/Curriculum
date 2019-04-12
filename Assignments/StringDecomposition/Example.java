import utils.Sentence;
import java.util.List;
import java.util.ArrayList;

public class Example {
    public static String msg = "Given the circumstances, I'm not sure if it was a success, but it certainly seems promising.";

	public static void main(String[] args) {
		Sentence sen = new Sentence(msg);

		for(String word : sen.getWords()) {
			System.out.println(word);
		}
	}
}