/***********************************************************************/
/** "Write a ConsoleProgram that reads in words and prints out their
/*  score in Scrabble, not counting any of the other bonuses that occur
/*  in the game. You should ignore any characters other than uppercase
/*  letters in computing the score. In particular, lowercase letters are
/*  assumed to represent blank tiles, which can stand for any letter but
/*  which have a score of 0."
/*
/*    To make this a little more fun, I copied the console-program from
/*    the 1983 film War Games. 
/***********************************************************************/

import java.util.*;

public class Scrabble {
    /**  main method  */
    public static void main(String[] args)  {
    
        char A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
        Scanner userInput = new Scanner(System.in);
        String word;
        System.out.println("WELCOME TO GLOBAL THERMONUCLEAR WAR");
        System.out.println("Would you like to play a game?");
        System.out.println("Type \"quit\" in small letters at anytime to stop the game...or will it??");
       // System.out.println("...or will it????    :-)");
        do {                   // do-while loop to prompt user for words
        System.out.print("Please enter a word all in capitals: ");    
        word = userInput.nextLine();
        int total = 0;
        char[] stringToCharArray = word.toCharArray();

        for (int i = 0; i < stringToCharArray.length; i++)  {

            switch (stringToCharArray[i])   { 
                case 'A': case 'E': case 'I': case 'L': case 'N': case 'O':
                case 'R': case 'S': case 'T': case 'U': //  A, E, I, L, N, O, R, S, T, U
                    total = total + 1;  
                    break;
                case 'D': case 'G':                     //  D, G
                    total = total + 2;
                    break;
                case 'B': case 'C': case 'M': case 'P': // B, C, M, P
                    total = total + 3;
                    break;
                case 'F': case 'H': case 'V': case 'W': case 'Y': 
                    total = total + 4;                  //F , H, V, W, Y
                    break;
                case 'K':  
                    total = total + 5;  
                    break;
                case 'J': case 'X':                     // J, X
                    total = total + 8;
                    break;
                case 'Q': case 'Z' :                    // Q, Z
                    total = total + 10;
                    break;
                case ' ':                               // specifically gives spaces 0
                    total = 0;
                default: {
                    total = 0;                          // all other ch
                    }
            }//end of switch
        } //end of for loop
        if ((!word.equals("quit")))
            System.out.println(word + " is worth " + total + " points");
        }  while ((!word.equals("quit")));
    System.out.println(" Would you like to play again?  :-) ");
    System.out.println("----GLOBAL THERMONUCLEAR WAR----");
    } //end of main
} //end of class TestSwitch
