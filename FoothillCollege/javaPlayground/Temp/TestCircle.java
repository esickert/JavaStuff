public class TestCircle {
    /** main method */
    public static void main(String[] args)  {
        Circle circle1 = new Circle();
        
        System.out.println("Before creating circle2");
        System.out.print("circle1 is : ");
        printCircle(circle1);

        //create circle2
        Circle circle2 = new Circle(5);

        circle1.setRadius(9);
        
        //display circle1 and circle2 after circle2 created
        System.out.println("\nAfter creating circle2 and modifying " +
            "circle1's radius to 9");
        System.out.print("circle1 is : ");
        printCircle(circle1);
        System.out.print("circle2 is : ");
        
    } //end of main

     public static void printCircle(Circle temp) {
        System.out.println("radius (" + temp.getRadius() +
            ") and get number of Circle objects (" +
            temp.getNumberOfObjects() + ")");
    } //end of printCircle

} //end of class
        
