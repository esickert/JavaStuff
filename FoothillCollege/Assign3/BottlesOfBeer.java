//The first verse of the song “99 Bottles of Beer” is:

//    99 bottles of beer on the wall, 99 bottles of beer, ya’ take one down, ya’ pass it around, 98 bottles of beer on the wall.

//Subsequent verses are identical except that the number of bottles gets smaller by one in each verse, until the last verse:

//    No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!

//And then the song(finally) ends.

//Write a program that prints the entire lyrics of “99 Bottles of Beer.”

public class BottlesOfBeer	{
    //*   main method  //
    public static void main(String[] args)	{
    
    beerSong();

    }
    public static void beerSong()	{
	for(int i = 99; i > 0; i--)
	    System.out.println(i + " bottles of beer on the wall, "
	    + i + " bottles of beer, ya’ take one down, ya’ pass it around, "
	    +  (i - 1) + " bottles of beer on the wall.");
	System.out.println("No bottles of beer on the wall, no bottles of beer,"
	    + "ya’ can’t take one down, ya’ can’t pass it around, ’cause there "
	    + "are\nno more bottles of beer on the wall!");
    }
}    

	
