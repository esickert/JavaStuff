import java.util.*;

public class TestCircle {
    /** Main Method  */
    public static void main(String[] args)  {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please input a radius value: ");
        int n = userInput.nextInt();
        /** Create a cicle with radius n */
        Circle myCircle;
        myCircle = new Circle(n);
        System.out.println(n);
        System.out.println("A radius of myCircle is " + myCircle.getRadius());
        System.out.println("The area of myCircle with radius " + n  + " is " + myCircle.findArea() );
    }
}
