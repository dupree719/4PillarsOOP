package fourpillarsoop.encapsulation.inheritance;

//Example 1b

public class Tiger extends Animals{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void attack(){
        System.out.println("CLAW");
    }
   public void makeNoise(){
       System.out.println("ROARRR");
   }


}
