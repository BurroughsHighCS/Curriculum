package util;

public class ConstructedSentenceUtil {
    public String[] subjects;
    public String[] objects;
    public String[] verbs;

    public ConstructedSentenceUtil(String[] subjects; String[] objects; String[] verbs) {
        this.subjects = subjects;
        this.objects = objects;
        this.verbs = verbs;        
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