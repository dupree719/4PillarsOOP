package sets;

import java.util.*;

/*
******Sets only contain unique items - no duplicates (just won't show up twice)

#HashSet sorts in NO specific order
#LinkedHashSet sorts in the order you added items in
#TreeSet sorts in NATURAL order

Sets are optimized for finding particular items quickly

 */

public class SetsDemo {

    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<>();

        System.out.println("Does this set have any elements in it yet?");
        if(set1.isEmpty()){
            System.out.println("Set is empty at start");
        }
        System.out.println("\n");

        set1.add("pencil");
        set1.add("notebook");
        set1.add("binder");
        set1.add("textbook");

        System.out.println("Printing elements in set:");
        System.out.println(set1);
        System.out.println("\n");

        //Iteration with enhanced for loop - same as usual
        System.out.println("Looping through each element of set");
        for(String element : set1){
            System.out.println(element);
        }
        System.out.println("\n");

        //.contains() checks to see if an element exists in set, if not, prints nothing
        if(set1.contains("pen")){
            System.out.println("Contains pen");
        }

        //Sysout prints because pencil exists in set
        if(set1.contains("pencil")){
            System.out.println("Contains pencil");
        }
        System.out.println("\n");

          Set<String> set2 = new TreeSet<String>();


        set2.add("dog");
        set2.add("cat");
        set2.add("pencil");
        set2.add("textbook");


        Set<String> intersection = new HashSet<String>(set1); //makes intersection a copy of set1

        intersection.retainAll(set2); //retains only the elements in set1 that are also common in set2 -> intersection now has access to items in both set1&2

        System.out.println("Now printing items that set1 and set2 have in common");
        System.out.println(intersection);

        System.out.println("\n");

        //Finds the elements that are in set 1 that are not in set2
        System.out.println("Now printing the elements set1 has that set2 does not");
        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set2);
        System.out.println(difference);


    }


}
