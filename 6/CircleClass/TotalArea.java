public class TotalArea    {
    // you had your blocking all screwed up when typing this in!!!
    /** main method */
    public static void main(String[] args)  {

        //declare a circle array
        Circle[] circleArray;
    
        //create circleArray
        circleArray = createCircleArray();

        //print circleArray and total area of the circles
        printCircleArray(circleArray);
    } // end of main   main is a block-you need to end it!!~!!!!!~

        /** create an array of Circle objects */
        public static Circle[] createCircleArray()   {
            Circle[] circleArray = new Circle[10];

            for (int i = 0; i < circleArray.length; i++)    {
                circleArray[i] = new Circle(Math.random() * 100);
            }   
            // return circle array
            return circleArray;
        }  // end of method createCircleArray

//*

    /** print an array of circles and their total area  */
    public static void printCircleArray(Circle[] circleArray)   {
        System.out.println("Radius\t\t\t\t" + "Area");
        for (int i = 0; i < circleArray.length; i++)    {
            System.out.print(circleArray[i].getRadius() + "\t\t" 
            + circleArray[i].findArea() + '\n');
        } //end of for loop
    
        System.out.println("---------------------");

        // compute and display the result
        System.out.println("The total areas of circles is \t"
            + sum(circleArray));
    } //end of method printCircleArray

    /**  Add circle areas  */
    public static double sum(Circle[] circleArray)  {
        //initialize sum
        double sum = 0.0;

        //find areas to sum
        for (int i = 0; i < circleArray.length; i++)    {
            sum = sum + circleArray[i].findArea();
        }
        return sum;
    }

} // end of class
    
