public class Circle {
    /** The radius of a circle */
    private double radius;
    /** the number of objects created.  */
    private static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    Circle()    {
        numberOfObjects++;
    }

    /** Construct a circle with assigned radius */
    Circle(double newRadius)    {
        radius = newRadius;
        numberOfObjects++;
    }

    /** get radius  */
    public double getRadius()   {
        return radius;
    }

    /** set a new radiuis  */
    public void setRadius(double newRadius) {       // conditional statement
        radius = (newRadius >= 0) ? newRadius : 0;  //this is the same as
    }                                               // if (newRadius >= 0)
                                                    //     radius = newRadius;
                                                    // else
                                                    //     radius = 0;
       

    /** return the area of the ciircle  */
    public double findArea()    {
        return radius * radius * Math.PI;
    }

    /** return the number of objects */
    public static int getNumberOfObjects()  {
        return numberOfObjects;
    }
} //end of class Circle
