import utils.*;

class Example {
    public static void main(String[] args) {
        sentenceExample();
    }

    public static void sentenceExample() {
        String sentence = StaticSentenceMaker.generateSentence();
        System.out.println(sentence);
    }

}