package fourpillarsoop.encapsulation.inheritance;

//Example 3b

/*
The class Pablo extends Human because he is a Human.
Once extended, Pablo becomes a child class of Human which is now a parent class.
Pablo now inherits all the properties Human has.
 */

public class Pablo extends Human{

    public Pablo(String name, char sex, int age) {
        super(name, sex, age);


    }
}
