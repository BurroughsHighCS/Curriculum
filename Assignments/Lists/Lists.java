import java.util.*;

class Lists {
    public static void main(String[] args) {
        // int[] VALUES = {1,2,3,0,5,0,2,3,1};

        // int[] results = {0,0,0,0,0,0,0,0,0};

        // results[position]++;

        // int[] powers = {1,2,4,8,16};

        ArrayList<Integer> powList = new ArrayList<Integer>();

        powList.add(1);
        powList.add(2);
        powList.add(4);
        powList.add(8);
        powList.add(16);

        for(Integer power : powList) {
            System.out.println(power);
        }



    }
}