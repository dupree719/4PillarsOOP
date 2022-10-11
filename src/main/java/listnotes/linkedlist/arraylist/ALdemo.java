package listnotes.linkedlist.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ALdemo {
    public static void main(String[] args) {

        ArrayList<String> listName = new ArrayList<>();
        listName.add("Jimmy");
        listName.add("Joe");
        listName.add("John");
        System.out.println("Does this ArrayList contain the name John? true or false");
        System.out.println(listName.contains("John"));
        System.out.println("\n");
        System.out.println("Retrieving name: John");
        System.out.println(listName.get(2));
        System.out.println("\n");


        //Iterate through list with for loop (use SIZE instead of LENGTH)
        System.out.println("Iteration 1: For loop");
        for(int i=0; i < listName.size(); i++){
            System.out.println(listName.get(i));
        }
        System.out.println("\n");
        System.out.println("Iteration 2: Enhanced for loop minus last item:");
//        listName.remove(0); //Removing first item is slow because the next indexpos will fill it back in
        listName.remove(listName.size() -1); //deletes the last added item
        for(String names: listName){
            System.out.println(names);
        }
        System.out.println("\n");

    }
}
