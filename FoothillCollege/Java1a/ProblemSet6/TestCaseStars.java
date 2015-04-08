/***********************************************************************
/* Assignment 6.2                                      Erich Sickert
/*
/* Soo  this program too compiles and runs but the output not correct.
/* I haven't a clue where to go with this one. Recursion is not
/* my best point. Sorry!
/**********************************************************************/


public class TestCaseStars   {
    public static void main(String[] args)  {
        int n = 5;
        int m = 3;
    
        stars(n, m);

    }//end of main

    public static String stars(int n, int m)   {
        String p = "*";  
        if (n == 0) //{
            return p;
        else    {
            p = p + stars(n-1, m);
        System.out.print(p);
        System.out.println();
        return p;
        }
    } //end of stars
    
}//end of class
