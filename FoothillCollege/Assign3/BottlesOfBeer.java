public class BottlesOfBeer	{
    /**   Main method   */
    public static void main(String[] args)	{
    
    beerSong();

    }    //end of method main
    public static void beerSong()	{
	for(int i = 99; i > 0; i--)
	    System.out.println(i + " bottles of beer on the wall, "
	    + i + " bottles of beer, ya’ take one down, ya’ pass it around, "
	    +  (i - 1) + " bottles of beer on the wall.");
	System.out.println("No bottles of beer on the wall, no bottles of beer,"
	    + "ya’ can’t take one down, ya’ can’t pass it around, ’cause there "
	    + "are\nno more bottles of beer on the wall!");
    }    //end of  method beerSong
}    //end of class BottlesOfBeer    

	
