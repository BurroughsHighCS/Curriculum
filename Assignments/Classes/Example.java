import utils.*;

class Example {
    public static void main(String[] args) {
        sentenceExample();
    }

    public static void sentenceExample() {
        String[] subjects = {"The dog", "The cat", "The fish"};
        String[] objects = {"the dog", "a ball", "my keyboard", "a door", "the desk"};
        String[] verbs = {"kicked", "bought", "ran into", "fell off of", "tried to jump across"};
        
        ConstructedSentenceUtil sentUtil = new ConstructedSentenceUtil(subjects, objects, verbs);

        String sentence = sentUtil.generateSentence();
        System.out.println(sentence);
    }

}