public class Circle {
    /** The radius of a circle */
    private double radius;

    /** Construct a circle with radius 1 */
    Circle()    {
//        radius = 1.0;
    }

    /** Construct a circle with assigned radius */
    Circle(double newRadius)    {
        radius = newRadius;
    }

    /** get radius  */
    public double getRadius()   {
        return radius;
    }

    /** set a new radiuis  */
    public void setRadius(double newRadius) {       // conditional statement
        radius = (newRadius >= 0) ? newRadius : 0;  //this is the same as
                                                    // if (newRadius >= 0)
                                                    //     radius = newRadius;
                                                    // else
                                                    //     radius = 0;
    }   

    /** return the area of the ciircle  */
    public double findArea()    {
        return radius * radius * Math.PI;
    }

} //end of class Circle
