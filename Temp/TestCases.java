public class TestCases  {

    private static int number;    //that was really a dumb mistake erich!!!!
    private double radius;
    private  double area;
    private int payGrade;
    private double basePay;
    

    static double[][] test = new double[3][5];

//    test = new int[3][5];

    TestCases() {     //constructor
    }

    TestCases(int newNum)   {      //contructor
        number = newNum;
    }

    TestCases(double newRadius) {
        radius = newRadius;    //constructors do NOT return a value
    }

    public int getNumber()   {
        return number;
    }

    public void setNum(int newNumber)   { //dont forget about return type void!!
        this.number = newNumber;
    }
    
    public int sum(int newNum)  {
        if (newNum < 100)
            return 100 + newNum;
        else
            return 1 + newNum;
    }

    double areaCircle(double radius)    {
        return area = radius * (radius * Math.PI);
    }

    double rate(int payGrade, int numberOfYears)    {
        if ((payGrade > 3) || (numberOfYears > 4))  {
            System.out.println("Invalid input");
            return -1;
        }
        else 
            return test[payGrade][numberOfYears];
    }

    

} // end of class
