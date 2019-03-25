package util;

public class ConstructedSentenceMaker {
	private String[] subjects = {};
    private String[] objects = {};
    private String[] verbs = {};

	public ConstructedSentenceMaker() {
        subjects = new String[] {"I", "He", "She", "That guy", "Whatshername", "The dog"};
        objects = new String[] {"the dog", "a ball", "my keyboard", "a door", "the desk"};
        verbs = new String[] {"kicked", "bought", "ran into", "fell off of", "tried to jump across"};
	}

	public ConstructedSentenceMaker(String[] _subjects, String[] _verbs, String[] _objects) {
        this();
		if(_subjects.length > 0){
			subjects = _subjects;
		}
		if(_verbs.length > 0) {
			verbs = _verbs;
		}
		if(_objects.length > 0) {
			objects = _objects;
		}
	}

    public String generateSentence() {
        String sentence = "";
        sentence += getRandomSubject() + " ";
        sentence += getRandomVerb() + " ";
        sentence += getRandomObject() + ".";

        return sentence;
    }

    private String getRandomSubject() {
        int selection = (int) (Math.random() * (double) subjects.length);
        return subjects[selection];
    }

    private String getRandomVerb() {
        int selection = (int) (Math.random() * (double) verbs.length);
        return verbs[selection];
    }

    private String getRandomObject() {
        int selection = (int) (Math.random() * (double) objects.length);
        return objects[selection];
	}
}