package petscomparablelab;


import java.util.Comparator;

public class TypeComparator implements Comparator<Pet> {

//Comparator implementation with compare method that will be used to sort through the classes and names of each Pet object
    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.getClass().getName().compareTo(o2.getClass().getName());
    }
}
