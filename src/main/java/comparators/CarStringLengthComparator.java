package comparators;

import java.util.Comparator;

 /*Comparator interface has one method called "compare"
            Use this when you want to sort in a particular order (name class after how you want it sorted)
             Comparator will be supplied by items in your list
             Compares items in list 2 at a time by whichever is greater
             The first line says if o1 is greater than o2: return 1 (a positive value)
             The second line says if o1 is less than o2: return -1 (a negative value)
             The third line says if neither are true: return 0
             */

public class CarStringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int len1= o1.length();
        int len2= o2.length();

        if(len1 > len2){          //first line
            return 1;          // first line
        }
        else if(len1 < len2){  //second line
            return -1;         //second line
        }
        return 0;              //third line
    }
}
