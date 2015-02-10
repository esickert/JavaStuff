public class TestArrays		{
    public static void main(String[] args)	{
        int size = 12;
	char[] testArray = new char[size];
	int[] myArray = new int[size];  //all elements of the array are initialized to 0!!
	String[] nouns = new String[13];
	boolean[] truths = new boolean[13];
	//int i = 0;
    
	for(int i = 0; i < testArray.length; i++)	{
	 //   testArray[i] = i;
	    System.out.print(" " + testArray[i]);
	} //end of for loop
	System.out.println();
	int i = 0;
	while (i < nouns.length)	{
	//    nouns[i] = " CAT ";
	    System.out.print(nouns[i] + " ");
	    ++i;
	} //end of while loop
	System.out.println();
	i = 0;
	while (i < truths.length)	{
	   // truths[i];
	    System.out.print(truths[i] + " ");
            i++;
	    } //end of while loop
	System.out.println();
	for(int j: testArray)
	    System.out.print(j);
	System.out.println();
		    
    
    } //end of main
} //end of class TestArrays
