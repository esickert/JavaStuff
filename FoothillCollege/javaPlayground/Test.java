public class Test   {

    double radius;
        
    Test()  {
    }

    Test(double radius)  {
        this.radius = radius;
    }   

    public double printRadius()   {
        return radius;
    }

    public double findArea()  {
        return radius * (radius * Math.PI);
    }

/*    public static void main(String[] args)  {
        Test a = new Test();
        Test b = new Test();

        System.out.println(b.printRadius());
        a.radius = 4.987;
        System.out.println("Radius of a is " + a.radius);
        System.out.println("Radius of b id " + b.radius);
    } //end of main  */
} //end of class
        
