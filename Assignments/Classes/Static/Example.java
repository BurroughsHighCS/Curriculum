import util.StaticSentenceMaker;

class Example {
    public static void main(String[] args) {
        sentenceExample();
    }

    public static void sentenceExample() {
        String subject = StaticSentenceMaker.generateSentence();
        System.out.println(subject);
    }
}