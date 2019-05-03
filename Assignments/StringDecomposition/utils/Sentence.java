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
			if(n < 0) {
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
		//Get size. Init Array.
		int size = this.countWords();
        String[] results = new String[size];

		//Store blank positions.
		List<Integer> blanks = this.getBlankPositions();

        int fromIdx = 0;
		for(int i = 0; i < size; i++){
			if(i < blanks.size()) {
				int toIdx = blanks.get(i);
				results[i] = sentence.substring(fromIdx, toIdx);
	            fromIdx = (toIdx + 1);
			}
			else {
				results[i] = sentence.substring(fromIdx);
			}
        }
        return results;
	}
}

