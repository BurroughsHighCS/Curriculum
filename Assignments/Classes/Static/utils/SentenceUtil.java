package utils;

public class SentenceUtil {
    private static String[] subjects = {"I", "He", "She", "That guy", "Whatshername", "The dog"};
    private static String[] objects = {"the dog", "a ball", "my keyboard", "a door", "the desk"};
    private static String[] verbs = {"kicked", "bought", "ran into", "fell off of", "tried to jump across"};

    public static String generateSentence() {
        String sentence = "";
        sentence += getRandomSubject() + " ";
        sentence += getRandomVerb() + " ";
        sentence += getRandomObject() + ".";

        return sentence;
    }

    private static String getRandomSubject() {
        int selection = (int) (Math.random() * (double) subjects.length);
        return subjects[selection];
    }

    private static String getRandomVerb() {
        int selection = (int) (Math.random() * (double) verbs.length);
        return verbs[selection];
    }

    private static String getRandomObject() {
        int selection = (int) (Math.random() * (double) objects.length);
        return objects[selection];
    }
}