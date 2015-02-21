import java.util.*;

public class TestSwitch {
    public static void main(String[] args)  {
    
//        int total = 0;
        char A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
        Scanner userInput = new Scanner(System.in);
        String word;
        do {
        System.out.print("Please enter a word: ");    
        word = userInput.nextLine();
        int total = 0;
        char[] stringToCharArray = word.toCharArray();
//        System.out.println(word);
        for (int i = 0; i < stringToCharArray.length; i++)  {

            switch (stringToCharArray[i])   { 
                case 'A': case 'E': case 'I': case 'L': case 'N': case 'O':
                case 'R': case 'S': case 'T': case 'U':           //  A, E, I, L, N, O, R, S, T, U
                    total = total + 1;  
                    break;
                case 'D': case 'G':                               //  D, G
                    total = total + 2;
                    break;
                case 'B': case 'C': case 'M': case 'P':           // B, C, M, P
                    total = total + 3;
                    break;
                case 'F': case 'H': case 'V': case 'W': case 'Y': //F, H, V, W, Y
                    total = total + 4;
                    break;
                case 'K':  
                    total = total + 5;  
                    break;
                case 'J': case 'X':                               // J, X
                    total = total + 8;
                    break;
                case 'Q': case 'Z' :                              // Q, Z
                    total = total + 10;
                    break;
                case ' ':
                    total = 0;
                default:
                    total = 0;
                    
            }//end of switch
        } //end of for loop
        if ((!word.equals("quit")))
            System.out.println(word + " is worth " + total + " points");
        }  while ((!word.equals("quit")));
    System.out.println("   BYE!!   :-) ");
    } //end of main
} //end of class TestSwitch
