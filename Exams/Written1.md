A text-editing program uses a `Sentence` class that manipulates a single sentence. A Sentence contains letters, blanks, and punctuation. The first character in a sentence is a letter, and the last character is a punctuation mark. Any two words in the sentence are separated by a single blank. A partial implementation of the Sentence class is as follows:

```Java
public class Sentence {
    /** The sentence to manipulate */
    private String sentence;

    /** @return an ArrayList of integer positions containing a blank in this sentence.
    * If there are no blanks in the sentence, return an empty list.
    */
    public List<Integer> getBlankPositions()
    { /* To be implemented in part (a) */ }

    /** @return the number of words in this sentence
    *   Precondition: Sentence contains at least one word
    */
    public int countWords()
    { /* To be implemented in part (b) */ }

    /** @return the array of words in this sentence
    *   Precondition:
    *       - Any two words in the sentence are separated by one blank
    *       - The sentence contains at least one word
    *   Postcondition: String[] returned containing the words in this sentence
    */
    public String[] getWords()
    { /* To be implemented in part (c) */ }

    //Constructor and other methods are not shown.
}
```

(a) Write the `Sentence` method `getBlankPositions` which returns an ArrayList of integers that represent the positions in a sentence containing blanks. If there are no blanks in the sentence, `getBlankPositions` should return an empty list.
Some results of calling `getBlankPositions` are shown below.

"I love you!" -> [1, 6]
"The cat sat on the mat." -> [3, 7, 11, 14, 18]
"Why?" -> [ ]

Complete method `getBlankPositions` on a hand-written sheet of paper.


(b) Write the `Sentence` method `countWords`, which returns the number of words in a sentence. Words are sequences of letters or punctuation, separated by a single blank. You may assume that every sentence contains at least one word.
For Example:

"I love you!" -> 3
"The cat sat on the mat." -> 6
"Why?" -> 1

Complete method `countWords` on a handwritten sheet of paper.


(c) Write the sentence method `getWords`, which returns an array of words in the sentence. A word is defined as a string of letters and punctuation, and does not contain any blanks. You may assume that a sentence contains at least one word.
Some examples of calling getWords are shown below:

"The bird flew away." -> {The, bird, flew, away.}
"Wow!" -> {Wow!}
"Hi! How are you?" -> {Hi!, How, are, you?}

In writing method getWords, you _must_ use methods `getBlankPositions` and `countWords`, which were written in parts (a) and (b). You may assume that these methods work correctly, irrespective of what you wrote in parts (a) and (b).

Complete method `getWords` on a handwritten sheet of paper.
