package abstraction;

/*Abstraction
Abstract class: is a restricted class that cannot be used to create objects
(to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body.
The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods as well.
You cannot create objects of an abstract class

 */

public abstract class Person {
    abstract void laugh();

}
