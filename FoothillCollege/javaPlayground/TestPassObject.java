public class TestPassObject {
    /** main method */
    public static void main(String[] args)  {
        Circle myCircle = new Circle(5);
        System.out.println(myCircle.findArea());
        // print areas for radius 1, 2, 3, 4, 5
        int n = 5;
        printArea(myCircle, n);
        System.out.println("***radius is " + myCircle.getRadius());
        
//        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }// end of main
        public static void printArea(Circle c, int time)   {
            System.out.println("Radius \t\tArea");
            while (time >= 1)    {
                System.out.println( "\t\t" + c.findArea());
//                c.setRadius(c.getRadius() + 1);
                time--;    
            } //end of while
        } //end of printArea

    
}
