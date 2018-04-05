# String Decomposition Exercise

1. Write the expected outputs of all print statements in the following block of code:
```Java
    String s = "I'd go, but I'm broke.";

    char c1 = s.charAt(7);
    System.out.println(c1);

    char c2 = s.charAt(10);
    System.out.println(c2);

    int idx1 = s.indexOf(',');
    System.out.println(idx1);

    int idx2 = idx1 + 3;
    System.out.println(idx2);

    char c3 = s.charAt(idx1);
    System.out.println(c3);

    char c4 = s.charAt(s.indexOf(c2) + 2);
    System.out.println(c4);

    char c5 = s.charAt(s.length() - 1);
    System.out.println(c5);

    int idx3 = s.indexOf('\'');
    System.out.println(idx3);

    int idx4 = s.indexOf("go");
    System.out.println(idx4);
```

2. Consider the following sentence:
```Given the circumstances, I'm not sure if it was a success, but it certainly seems promising.```

Write code to make three `ArrayList<Integer>`.
* One containing the positions of every space in the sentence.
* One containing the positions of every punctuation mark in the sentence (, or .).
* One containing the starting index of each word `it` (the index of the 'i' in each occurence of the word).
    * To test this code, the following loop should print two 'i's to the console:
    * ```Java
        for(int idx : YOURLIST) {
            System.out.println(SENTENCE.charAt(idx));
        }

3. Using the same sentence from question 2, write code to make a single `ArrayList<String>` containing each word in the sentence.

* You don't need to remove punctuation from the words. If your list contains `circumstances,` `success,` and `promising.` as words, that's fine.
* As a bonus challenge, try removing the punctuation from the words as well.
