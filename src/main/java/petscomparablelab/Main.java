package petscomparablelab;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//            Pet dog = new Pet(); //System asks for name and you can add name (in parameters)
//          Pet dog = new Pet("Timmy"); //System doesn't ask for name, expects input in parameters



        Scanner x = new Scanner(System.in); //Created Scanner object called 'x' - allows input from user

        System.out.println("How many pets do you have?");

        int qty = x.nextInt(); //Assigned variable "qty" to recognize a new line for ints from user inputs

        Pet[] petList = new Pet[qty]; //Create an array list that loops through for any number of pets user inputs using "qty" variable
        x.nextLine();

        //Iteration through petList array that contains:
        // - Recognition of however many pets the user inputs after asked "How many pets do you have?" because of previous lines
        // - For Loop that says: For each # of pet, this question will be asked the same amount of times until fulfilled. 3 pets = it will ask this question 3x
        // - If statements that say if the user inputs any of these strings (whether capitalized or not), the current element of petList will be assigned to it
        // - Another for loop that first gets the name of each object added to the petList array and second calls the speak method on those specified objects that override the speak method with their own sound
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

        //Sorting

        //This sorts through each pet by name in A-Z order
        Arrays.sort(petList);
        for (int i = 0; i < petList.length; i++) {
            System.out.println(petList[i].getName());
        }

        //This sorts through each pet by type by class, also in A-Z order
        Arrays.sort(petList, new TypeComparator());
        for (int i = 0; i < petList.length; i++) {
            System.out.println(petList[i].getClass());


        }

    }
}

