import java.util.ArrayList;

class StringDecomp {
    public static String message = "Substring is a powerful tool in any language. "
                    + "Its definition changes between languages, which can be tricky. "
                    + "In some languages, the second parameter is the length of the desired substring, "
                    + "while in others, its the endpoint of the desired substring. "
                    + "In Java, the second parameter (when included) defines the ENDPOINT of the substring. ";
    
    public static void main(String[] args) {
        ArrayList<String> words = getParts(" ");

        for(String s : words) {
            System.out.println(s);
        }

        ArrayList<String> sentences = getParts(". ");

        for(String s : sentences) {
            System.out.println(s);
            System.out.println("");
            System.out.println("");
        }
    }

    public static ArrayList<String> getParts(String delimeter) {
        ArrayList<String> result = new ArrayList<String>();

        String msgCopy = message;
        while(true) {
            int nextDelim = msgCopy.indexOf(delimeter);
            if(nextDelim == -1) {
                break;
            }
            result.add(msgCopy.substring(0, nextDelim));
            msgCopy = msgCopy.substring(nextDelim + delimeter.length());       
        }

        return result;
    }
}