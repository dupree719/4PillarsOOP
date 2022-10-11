package HashMap;

/*
A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value).
It can store different types: String keys and Integer values, or the same type, like: String keys and String values

#Putting and getting is the essence of maps - however there is more you can do such as iterating through

##Keys and values in a HashMap are actually objects - Must use Wrapper Classes when specifying types (Double, Integer, Boolean...)

 */

import java.util.HashMap;
import java.util.Map;

public class HashMapdemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //Add ENTRIES to map using .put()
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(1, "One");
        map.put(1, "Overwrite test");

        //The Integers are keys to retrieve the Strings
        //You can overwrite a key by using it again; Java will recognize the bottom-most use
        //Print object with .get()
        System.out.println("Now getting value using key '1':");
        String text = map.get(1);
        System.out.println(text);
        System.out.println("\n");


        //Iteration:

        //This prints ALL keys and values with a enhanced for loop
        System.out.println("Now printing all keys and values in no specific order:");
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        System.out.println("\n");

        System.out.println("Now printing only the KEYS:");
            for (Integer i : map.keySet()) {
                System.out.println(i);
            }
        System.out.println("\n");
        System.out.println("Now printing only the VALUES:");
        for (String i : map.values()) {
            System.out.println(i);
        }
        System.out.println("\n");
        System.out.println("Now printing size of HashMap map:");
            System.out.println(map.size()); //<--- Print size of the map

        }

    }


