public class TestCaseStars2   {
    public static void main(String[] args)  {
    int m = 3;
    int n = 3;
    
    //    System.out.println(stars(n, m));
        printStars(n);   
//        printTriangle(m,n,5);

    }//end of main

    public static String printStars(int n)   {
        String p = "*";  
        if (n == 0)          //base case
            return p;
        else    {
            System.out.print(p);
            return printStars(n - 1);
            }
  
    }
      
        
            
            
//        } //end else
    //    return p;
//    } //end of stars

/*  public static void printTriangle (int leftInLine, int currLineSize, int leftLinesCount) {
    if (leftLinesCount == 0)
        return;
    if (leftInLine == 0){ //Completed current line?
        System.out.println();
        printTriangle(currLineSize+1, currLineSize+1, leftLinesCount-1);
    }else{
        System.out.print("*");
        printTriangle(leftInLine-1,currLineSize,leftLinesCount);
    }                       */
                   

    
}//end of class
/*
OUTPUT:
n = 3
*
**
***

n = 4
*
**
***
****

n = 5
*
**
***
****
*****
 
n = 5  and
System.out.println(stars(n));
*
**
***
****
*****
*****

int n = 5; 
    System.out.println(stars(n));
    stars(n);
*
**
***
****
*****
*****

*
**
***
****
*****
  

*/
