package petscomparablelab;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//            Pet dog = new Pet(); //System asks for name and you can add name (in parameters)
//          Pet dog = new Pet("Timmy"); //System doesn't ask for name, expects input in parameters


        Scanner x = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int qty = x.nextInt();
        Pet[] petList = new Pet[qty];
        x.nextLine();
        for (int i = 0; i < petList.length; i++) {
            System.out.println("What kind of pets are they?");
            String kind = x.nextLine();

            if (kind.equalsIgnoreCase("Cat")) {
                petList[i] = new Cat();
            } else if (kind.equalsIgnoreCase("Dog")) {
                petList[i] = new Dog();
            } else if (kind.equalsIgnoreCase("Bunny")) {
                petList[i] = new Bunny();

            }
        }
        for (int i = 0; i < petList.length; i++) {
            System.out.println(petList[i].getName());
            petList[i].speak();

        }
        System.out.println("\n");

        Arrays.sort(petList);
        for (int i = 0; i < petList.length; i++) {
            System.out.println(petList[i].getName());
        }
        Arrays.sort(petList, new TypeComparator());
        for (int i = 0; i < petList.length; i++) {
            System.out.println(petList[i].getClass());


        }

    }
}

