/***********************************************************************/
/**Assignment 5.2 Scrabble                               Erich Sickert 
/*
/* "Write a ConsoleProgram that reads in words and prints out their
/*  score in Scrabble, not counting any of the other bonuses that occur
/*  in the game. You should ignore any characters other than uppercase
/*  letters in computing the score. In particular, lowercase letters are
/*  assumed to represent blank tiles, which can stand for any letter but
/*  which have a score of 0."
/*
/*  Scrabble displays an animated welcome screen before prompting the
/*  user for input. It will then count up the Scrabble scores for each
/*  letter in the word. Blanks and tabs are treated as 0 as well as any
/*  other special characters.     
/***********************************************************************/

import java.util.*;

public class Scrabble {
    /**  main method  */
    public static void main(String[] args)  {
    
        char A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
        Scanner userInput = new Scanner(System.in);
        String word;
 
        String message = "********* WELCOME TO SCRABBLE SCORE *********";
        char[] chars = message.toCharArray();
        int x = 0;
        
        for (int i = 0; i < chars.length; i++) { // Prints each char from the array one
            System.out.print(chars[i]);          // at a time sleeping for 1/10 sec between
            try {                                // each display.
            Thread.sleep(100);                   // Animated intro to the program...cool huh? :-)
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();                   // Prints a new line under the animated intro
        System.out.println("** Type a word to see its' Scrabble score ***.");
        System.out.println("Type \"quit\" in small letters to quit the program.");
        do {                                    // do-while loop to prompt user for input
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
                    case ' ':                               
                        break;
                    default: 
                                         // all other characters
                } //end of switch
            } //end of for loop
            if ((!word.equals("quit"))) //"QUIT" in capitals is considered a Scrabble word and scored
                System.out.println(word + " is worth " + total + " points");
        }  while ((!word.equals("quit")));
        System.out.println("********** GAME OVER! **********");
    } //end of main
} //end of class TestSwitch
