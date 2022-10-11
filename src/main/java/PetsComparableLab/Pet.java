package PetsComparableLab;

import java.util.Scanner;

public class Pet implements Comparable<Pet>{
    private String name;
    Scanner x = new Scanner(System.in);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(){ //Creates pet objects
        System.out.println("What are their names?");
         this.name = x.nextLine();

    }

    public Pet(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println("Pet sound");

    }


    @Override
    public int compareTo(Pet o) {
        return this.name.compareTo(o.name);
    }
}

