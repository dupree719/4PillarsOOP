package fourpillarsoop.encapsulation;

/*
Encapsulation is a way of establishing security of code. You can make variables private to just this class here
and then give other classes access to those same variables by using methods (setters and getters).
It also lets us alter our original code without breaking it for others who have adopted it.
 */

public class Person {
    //original code - private variables. These need setters&getters in order to be accessed by any other class
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
