package enumerator;



public class Main {
    public static void main(String[] args) {
        //Use Animal enum like a class, set animal variable == Animal.MONKEY so Java can recognize the enum, can't just say "MONKEY
        Animal animal = Animal.MONKEY;

        switch(animal){
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MONKEY:
                System.out.println("Monkey");
                break;
                //Always include default at the end
            default:
                break;
        }
        //Printing whatever you called your Animal enum object, you can override this with a toString
        //and have the system print in your own custom format
        System.out.println(Animal.DOG);
        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);

        //Prints the enum constant as a string
        System.out.println("Enum name as a string: " + Animal.DOG.name());

        //Printing where said enum object originated
        System.out.println(Animal.DOG.getClass());

        //Prints a boolean based on whether the enum object is instance of a particular class or not
        //Both print true
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.DOG instanceof Animal);

        //Use this method to print name as you would with a normal class/object
        System.out.println(Animal.DOG.getName());

    }
}
