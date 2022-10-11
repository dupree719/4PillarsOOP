package iterator;

/*

The iterator() method can be used to get an Iterator for any collection:


 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //New collection
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Get the iterator from Iterator class
        Iterator<Integer> iterator = numbers.iterator();



//        System.out.println("Now printing the first item in my collection:");
//        System.out.println(iterator.next());
//        System.out.println("\n");




        //LOOPING W/ ITERATOR

        //Use while loop to iterate through with Iterator using hasNext() and next() methods
//        System.out.println("Now looping through collection with Iterator:");
//
////        while(iterator.hasNext()){
////            System.out.println(iterator.next());
////        }


        //REMOVING WITH ITERATOR

        //Remove numbers less than 5 from collection with Iterator
        while(iterator.hasNext()){
            //Establish a variable to represent the next runnerup in the collection to be called
            Integer i= iterator.next();

                if(i < 5){              //If the number in the collection is less than 5...
                iterator.remove(); //Remove it
            }
        }
        System.out.println(numbers);



    }
}
