import java.util.ArrayList;

class StringDecomp {
    public static final String msg = "Given the circumstances, I'm not sure if it was a success, but it certainly seems promising.";

    public static void main(String[] args) {
        ArrayList<Integer> spacePositions = getDelimiterPosition(" ");
        ArrayList<Integer> commaPositions = getDelimiterPosition(",");
        ArrayList<Integer> itPositions = getDelimiterPosition("it");
    }

    public static ArrayList<Integer> getDelimiterPosition(String delim) {
        ArrayList<Integer> results = new ArrayList<Integer>();

        String msgCopy = msg;
        int lastPos = 0;
        while(true) {
            int pos = msgCopy.indexOf(delim);
            if(pos < 0) {
                break; 
            }
            results.add(lastPos + pos);
            msgCopy = msgCopy.substring(pos + delim.length());
            System.out.println(msgCopy);
            lastPos += pos + delim.length();
        }

        for(Integer i : results) {
            System.out.println(i);
            if(msg.substring(i, i + delim.length()).equals(delim))
                System.out.println("Correct");
            else
                System.out.println("Incorrect");
            
        }

        return results;
    }
}