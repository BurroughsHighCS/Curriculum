import util.ConstructedSentenceMaker;

class Example {
    public static void main(String[] args) {
        sentenceExample();
    }

    public static void sentenceExample() {
		ConstructedSentenceMaker defaultMaker = new ConstructedSentenceMaker();

		String[] subjects = {};
		String[] verbs = {};
		String[] objects = {"a different cat", "the dumb dog", "a puny human", "some box", "a rickety piano"};
		ConstructedSentenceMaker customMaker = new ConstructedSentenceMaker(subjects, verbs, objects);

        System.out.println("Maker 1:");
		System.out.println(defaultMaker.generateSentence());
		System.out.println(defaultMaker.generateSentence());
		System.out.println(defaultMaker.generateSentence());
		System.out.println(defaultMaker.generateSentence());
		System.out.println(defaultMaker.generateSentence());

		System.out.println("\nMaker 2:");
		System.out.println(customMaker.generateSentence());
		System.out.println(customMaker.generateSentence());
		System.out.println(customMaker.generateSentence());
		System.out.println(customMaker.generateSentence());
		System.out.println(customMaker.generateSentence());

    }
}