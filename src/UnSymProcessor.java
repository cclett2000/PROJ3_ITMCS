//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Name: UnSymProcessor
// Function: union/symmetric difference (2 sets)
// Programmer: Charles Lett Jr.
// Last Update: 03/04/22
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++

import java.util.ArrayList;
import java.util.Arrays;

public class UnSymProcessor {
    final static boolean ENABLE_DEBUG = true;

    public void run(char[] set1, char[]set2){
        getUnion(set1, set2);
        getSymDiff(set1, set2);
    }

    // gets union between two sets
    private void getUnion(char[] set1, char[] set2){
        System.out.println("***Set Union***");
        System.out.println("\tSet1: " + Arrays.toString(set1));
        System.out.println("\tSet2: " + Arrays.toString(set2));

        boolean isPresent = true;
        ArrayList<Character> temp = new ArrayList<>();

        // fill temp with set1
        for(int i = 0; i < set1.length; i++){
            temp.add(set1[i]);
        }

        // fill temp with set2 - with check
        for (int j = 0; j < set2.length; j++){
            if (checkList(temp, set2[j]) == false){
                temp.add(set2[j]);
            }
        }

        System.out.println("\tUnion Array: " + temp);
    }

    // gets symmetric difference between two sets
    private void getSymDiff(char[] set1, char[] set2){
        System.out.println("\n***Set Symmetric Difference***");
        System.out.println("\tSet1: " + Arrays.toString(set1));
        System.out.println("\tSet2: " + Arrays.toString(set2));

        boolean isPresent = true;
        ArrayList<Character> temp = new ArrayList<>();

        // fill temp with set1
        for(int i = 0; i < set1.length; i++){
            temp.add(set1[i]);
        }

        // fill temp with set2 - with check
        for (int j = 0; j < set2.length; j++){
            for (int k = 0; k < temp.size(); k++){
                if (set2[j] == temp.get(k)){
                    temp.remove(k);
                }
            }
        }

        System.out.println("\tSymDiff Array: " + temp);

    }

    // checks if key is present in arraylist
    private boolean checkList(ArrayList<Character> list, char key){
        boolean isPresent = false;

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == key) isPresent = true;
        }

        if (ENABLE_DEBUG) System.out.println("\t\t > checkList Result = " + isPresent);

        return isPresent;
    }
}
