package polymorphism;

/*
Polymorphism just means "many forms"
One method can do different things even though it still has the same name
Cars has a method that drives 45mph
Bugatti is a child class of Cars but goes 90mph because it Overrides the Cars method with its own action
 */
public class Main {
    public static void main(String[] args) {
        Cars c1 = new Bugatti();
        c1.getSpeed();

    }
}
