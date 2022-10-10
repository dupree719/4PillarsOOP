package inheritance;

//Example 1a

public class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Tiger name ='" + name + '\'' +
                '}';
    }

    public void attack(){
        System.out.println("Attack");
    }
}
