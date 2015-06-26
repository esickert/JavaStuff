public class TestPlayJava   {

    public static void main(String[] args)  {

        String tmp = "This is the end, my friend";
        
        PlayJava me = new PlayJava("My only friend the end");
<<<<<<< HEAD

		for(int i = 0; i <= me.myOtherArray.length - 1; i++)	{  // array length not declared!! now it is !!!
			me.myOtherArray[i] = "Hello";  //remember array length is - 1 because we start at 0
			System.out.println(me.myOtherArray[i]);
=======
/*        me.myArray = {
		{"A1", "A2", "A3"},
		{"B1", "B2", "B3"},
		{"C1", "C2", "C3"}
		};*/
		for(int i = 0; i <= me.myOtherArray.length; i++)	{  // array length not declared!!
			me.myOtherArray[i] = "Hello    ";
			System.out.print(me.myOtherArray[i]);
>>>>>>> 13e4821aaaa6a176dadd6b6eaf019de4a3938a82
		}
        me.printString();
        System.out.println(me.Reverse(me.get()));
        me.put(tmp);
        System.out.println(me.Reverse(me.get()));
//        System.out.println(me.Reverse(me.get()));
        me.printString();
        for(int i = 0; i <= 2; i++)	{
			System.out.println();
			for(int j = 0; j <= 2; j++)	{
				System.out.print(me.myArray[i][j]);
			}
		}
// myList is an ArrayList of String values		
		for(int i = 0; i <= 10; i++)	{
			me.myList.add(i,"Took a face from the ancient gallery"); //note that I can reference the arraylist index!! That's NEW to me.
		} //end of for loop
		
		for(int i = 0; i <= 9; i++)	{  //major memory error. heap overflow.
			System.out.println(me.myList.get(i));
			// System.out.println("olleh");
		}
		System.out.println();
	}
}
