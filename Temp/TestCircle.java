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
        Circle anotherCircle = new Circle();
        anotherCircle.setRadius(1.0);
        System.out.println(n);
        System.out.println("A radius of myCircle is " + myCircle.getRadius());
        System.out.println("The area of myCircle with radius " + n  + " is " + myCircle.findArea() );
        printCircle(myCircle);
        printArea(myCircle, n);
        printArea(anotherCircle, 3);
        System.out.println("The number of object instances is " + Circle.getNumberOfObjects());
    }

    /** passing an object by value  */
    public static void printCircle(Circle c)    {
        System.out.println("The area of a circle of radius " 
            + c.getRadius() + " is " 
            + c.findArea());
    }

    public static void printArea(Circle c, int times)   {
        System.out.println("Radius \t\tArea");
        while (times >= 1)  {
            System.out.println(c.getRadius() + "\t\t"
            + c.findArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
