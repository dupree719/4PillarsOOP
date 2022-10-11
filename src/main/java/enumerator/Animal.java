package enumerator;


/*
Creating enum just as you would when creating a class, all Java keywords are lowercase
Create enums as formatted below: All UPPERCASE separated by a single comma
These can only represent one type, for example: Animals, Temperatures, Clothing, etc.
 */

public enum Animal {

    //Created enum Objects of type Animal

    DOG("Doggy"), CAT("Kitty"), MONKEY("Monke");

    private String name;

    public String getName() {
        return name;
    }


//You can give enum types a constructor that hold parameters of whatever you want
    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This animal is called: " + name;
    }
}
