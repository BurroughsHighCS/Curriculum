public class Sentence {
    /** The sentence to manipulate */
    private String sentence;

    /** @return an ArrayList of integer positions containing a blank in this sentence.
    * If there are no blanks in the sentence, return an empty list.
    */
    public List<Integer> getBlankPositions(){ 

    }

    /** @return the number of words in this sentence
    *   Precondition: Sentence contains at least one word
    */
    public int countWords() { 

    }

    /** @return the array of words in this sentence
    *   Precondition:
    *       - Any two words in the sentence are separated by one blank
    *       - The sentence contains at least one word
    *   Postcondition: String[] returned containing the words in this sentence
    */
    public String[] getWords() { 
        String[] result = new String[countWords()];
        ArrayList<Integer> blankPositions = getBlankPositions();

        for(int i = 0; i < blankPositions.size(); i++) {
            int position = blankPositions.get(i);
            int prevPosition;
            if(i == 0) {
                prevPosition = 0;
            }
            else {
                prevPosition = blankPositions.get(i - 1) + 1;
            }
            result[i] = sentence.substring(prevPosition, position - prevPosition);
        }

        if(blankPositions.size() == 0) {
            results[0] = sentence;
        } else {
            int lastBlank = blankPositions.get(blankPositions.size() - 1);
            results[results.length - 1] = sentence.substring(lastBlank + 1);
        }

        return results;
    }

    public String[] getWordsPartialSolution() {
        //Pseudocode
        String[] result = new String[countWords()];
        ArrayList<Integer> blankPositions = getBlankPositions();

        for(i in blankPositions) {
            position = blankPositions at i;
            if(i == 0) {
                //Boundary case
            }
            else {
                prevPosition = blankPosition at i - 1;
                results[i] = sentence.substring(prevPosition, position - prevPosition);
            }
        }
        //Get Last Word
        return results;
    }

    //Constructor and other methods are not shown.
}