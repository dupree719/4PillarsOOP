package inheritance;

public class Main {
    public static void main(String[] args) {

        //Pablo gets Human attributes in constructor
        Pablo p = new Pablo("Pablo", 'M', 25);
        int a = 20, b = 10;

        //Add, subtract, and multiply methods from Calculation all available to MyCalculation object(s)
        MyCalculation demo = new MyCalculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);

        //Animals holds a method to attack. Tiger extends Animals so Tiger gets to attack now
        Tiger tiger = new Tiger("Tony");
        System.out.println(tiger); //prints toString (made in Animals)
        tiger.attack();
        tiger.makeNoise();

    }
}
