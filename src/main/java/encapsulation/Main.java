package encapsulation;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        //Setters
        person1.setName("Ken");
        person1.setId(1);
        //Getters
        System.out.println(person1.getName() + "\n" + person1.getId());

    }
}
