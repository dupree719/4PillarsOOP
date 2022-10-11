package listnotes.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(); //If you want to add or remove items at the END of list
        List<Integer> linkedList = new LinkedList<>(); //If you want to add or remove items from ANYWHERE else in the list
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
        }


    private static void doTimings(String type, List<Integer> list){

        for(int i=0; i<10000; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for(int i= 0; i<10000;i++){
            list.add(0, i);

        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type );

    }
}
