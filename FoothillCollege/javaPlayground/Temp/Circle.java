public class Circle{

    private double radius;
    private static int numberOfObjects;  // This variable is static so it changes for all instances of class

    Circle()    {    //constructor
    }
                      
    Circle(double newRadius)    {   //constructor
        radius = newRadius;
    }

    public double getRadius()    {
        double radius = 3.9;
        return radius;
    }

    public double setRadius(double newRadius)    {
        numberOfObjects++;
        return radius = newRadius;  
    }

    public static int getNumberOfObjects()  {
        return numberOfObjects;
    }

    public static void printCircle(Circle temp) {
        System.out.println("radius (" + temp.getRadius() +
            ") and get number of Circle objects (" +
            temp.getNumberOfObjects() + ")");
    } //end of printCircle

    public double findArea()    {
        numberOfObjects++;
        return radius = radius * Math.PI;
    }

//    public static void main(String[] args)  {
//        Circle userCircle = new Circle(5);
//        Circle circle2 = new Circle(2);
/*        System.out.println(userCircle.getRadius());
        userCircle.setRadius(3);
        System.out.println(userCircle.getRadius());
        System.out.println(userCircle.findArea());
        System.out.println(circle2.findArea());
        System.out.println(circle2.findArea());     */
//        System.out.println(getNumberOfObjects());
//    } // end of main
}// end of class       
        
    

    
        
