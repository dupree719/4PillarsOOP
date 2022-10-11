package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        cars.add("Durango");
        cars.add("Audi");
        cars.add("Lamborghini");
        cars.add("Ram");
        cars.add("Jetta");
        cars.add("Bentley");


        //Sorted in A-Z order
//        Collections.sort(cars, new CarStringLengthComparator()); //By DEFAULT, sort alone will always sort to natural order
                                                                 //Add a specific comparator -> you can sort however you want to
        Collections.sort(cars, new ReverseAZComparator());

        for(String vehicles: cars){ //Runs enhanced for loop through entire ArrayList
            System.out.println(vehicles);
        }
        List<Integer> nums = new ArrayList<>();

        nums.add(3);
        nums.add(10);
        nums.add(7);
        nums.add(15);
        nums.add(1);
        nums.add(2);

        Collections.sort(nums);
        for(Integer numbers: nums){
            System.out.println(numbers);

        }

    }
}
