package utils;
import java.util.List;
import java.util.ArrayList;

public class Sentence {
    public static String sentence;
	
	public Sentence(String _sentence) {
		sentence = _sentence;
	}
 
	public List<Integer> getBlankPositions() {
		List<Integer> blanks = new ArrayList<Integer>();

		int idx = 0;
		while(true) {
			//indexOf Params: 
			//[0] substring to be found;
			//[1] starting idx (search from this idx)
			int n = sentence.indexOf(" ", idx);
			if(n == -1) {
				break;
			}
			blanks.add(n);
			idx = n + 1;
		}

		return blanks;
	}

	public int countWords() {
		List<Integer> blanks = this.getBlankPositions();
		return blanks.size() + 1;
	}

	public String[] getWords() {

	}
}

