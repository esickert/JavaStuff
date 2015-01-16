import java.util.Scanner;   

class windChill    {
    //*    main class   */
    public static void main(String[] args)	{
    
    float t;
    float v;
    double w = 1.00;
    Scanner in = new Scanner(System.in);
    //System.out.println(
    System.out.print("Please enter a temperature: ");
    t = in.nextFloat();
    System.out.print("Please enter a wind velocity: ");
    v = in.nextFloat();
    if ((v < 3) || (v > 120))
        System.out.println("Invalid input!!!");
    else    {
        w =  35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16);
        System.out.println(w);
    }
//    v = in.nextInt();

 //   x = Math.pow(v,3);
 //   System.out.println(x);
    }
}

    
// w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v0.16
