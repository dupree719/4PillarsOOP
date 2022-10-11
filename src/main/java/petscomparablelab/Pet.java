package petscomparablelab;

import java.util.Scanner;

public class Pet implements Comparable<Pet>{

    //Holds name variable and a Scanner object
    private String name;
    Scanner x = new Scanner(System.in);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(){ //Constructor that asks what the Pet object's name is everytime a Pet object is created by user
        System.out.println("What are their names?");
         this.name = x.nextLine();

    }

//    public Pet(String name) {
//        this.name = name;
//    }

    //Original speak method
    public void speak(){
        System.out.println("Pet sound");

    }

    //Comparable that expects a Pet object
    //return statement says to compare whatever name that is input by user to the Object name
    @Override
    public int compareTo(Pet o) {
        return this.name.compareTo(o.name);
    }
}

